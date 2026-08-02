package ru.ok.android.webrtc.protocol.impl.serializers;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import org.chromium.net.NetError;
import org.json.JSONException;
import org.msgpack.core.b;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import org.msgpack.core.c;
import org.msgpack.core.d;
import org.msgpack.value.ValueType;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayout;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayoutItem;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandSerializer;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.commands.ReportNetworkStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatCommand;
import ru.ok.android.webrtc.protocol.commands.ReportPerfStatResponse;
import ru.ok.android.webrtc.protocol.commands.RequestAsrCommand;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Response;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;
import ru.ok.android.webrtc.protocol.impl.utils.Hex;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.go9;
import xsna.lhg;
import xsna.s3q0;
import xsna.vr;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class RtcCommandsMsgPackSerializer implements RtcCommandSerializer {
    public static final Companion Companion = new Companion(null);
    public final MappingProcessor a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public RtcCommandsMsgPackSerializer(MappingProcessor mappingProcessor) {
        this.a = mappingProcessor;
    }

    public static RtcCommandSerializer.SerializeResult a(long j, RtcCommand rtcCommand) {
        if (rtcCommand == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b.C2186b c2186b = b.b;
            c cVar = new c(new OutputStreamBufferOutput(byteArrayOutputStream, c2186b.d), c2186b);
            try {
                a(cVar, j, rtcCommand);
                s3q0 s3q0Var = s3q0.a;
                cVar.close();
                return new RtcCommandSerializer.SerializeResult(byteArrayOutputStream.toByteArray(), RtcFormat.BINARY);
            } finally {
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException(vr.b(rtcCommand.getClass(), "Unable to serialize command: "), e);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandSerializer
    public RtcCommandSerializer.DeserializeResult deserialize(byte[] bArr, RtcFormat rtcFormat) throws RtcCommandException {
        try {
            return a(bArr, rtcFormat);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(null, false, th);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandSerializer
    public RtcCommandSerializer.SerializeResult serialize(long j, RtcCommand<?> rtcCommand) throws RtcCommandException {
        try {
            return a(j, rtcCommand);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, th);
        }
    }

    public static void a(c cVar, long j, RtcCommand rtcCommand) {
        if (rtcCommand instanceof ReportPerfStatCommand) {
            ReportPerfStatCommand reportPerfStatCommand = (ReportPerfStatCommand) rtcCommand;
            cVar.h(1);
            cVar.h(0);
            cVar.i(j);
            cVar.i(reportPerfStatCommand.framesDecoded);
            cVar.i(reportPerfStatCommand.framesReceived);
            return;
        }
        if (rtcCommand instanceof UpdateDisplayLayoutV2Command) {
            UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command = (UpdateDisplayLayoutV2Command) rtcCommand;
            cVar.h(0);
            cVar.h(0);
            cVar.i(j);
            cVar.m(updateDisplayLayoutV2Command.isSnapshot ? (byte) -61 : (byte) -62);
            int size = updateDisplayLayoutV2Command.layouts.size();
            if (size == 0) {
                cVar.m((byte) -64);
            } else {
                int i = size * 2;
                if (i >= 0) {
                    if (i < 16) {
                        cVar.m((byte) (i | NetError.ERR_NO_SSL_VERSIONS_ENABLED));
                    } else if (i < 65536) {
                        cVar.q((byte) -36, (short) i);
                    } else {
                        cVar.o((byte) -35, i);
                    }
                    for (ServerDisplayLayoutItem serverDisplayLayoutItem : updateDisplayLayoutV2Command.layouts) {
                        String updateDisplayLayoutKey = SignalingProtocol.getUpdateDisplayLayoutKey(serverDisplayLayoutItem);
                        if (updateDisplayLayoutKey.length() <= 0) {
                            cVar.j(0);
                        } else if (!c.i && updateDisplayLayoutKey.length() >= cVar.b) {
                            if (updateDisplayLayoutKey.length() < 256) {
                                cVar.c((updateDisplayLayoutKey.length() * 6) + 3);
                                int b = cVar.b(cVar.g + 2, updateDisplayLayoutKey);
                                if (b >= 0) {
                                    if (cVar.d && b < 256) {
                                        MessageBuffer messageBuffer = cVar.f;
                                        int i2 = cVar.g;
                                        cVar.g = i2 + 1;
                                        messageBuffer.putByte(i2, (byte) -39);
                                        MessageBuffer messageBuffer2 = cVar.f;
                                        int i3 = cVar.g;
                                        cVar.g = i3 + 1;
                                        messageBuffer2.putByte(i3, (byte) b);
                                        cVar.g += b;
                                    } else if (b < 65536) {
                                        MessageBuffer messageBuffer3 = cVar.f;
                                        int i4 = cVar.g;
                                        messageBuffer3.putMessageBuffer(i4 + 3, messageBuffer3, i4 + 2, b);
                                        MessageBuffer messageBuffer4 = cVar.f;
                                        int i5 = cVar.g;
                                        cVar.g = i5 + 1;
                                        messageBuffer4.putByte(i5, (byte) -38);
                                        cVar.f.putShort(cVar.g, (short) b);
                                        cVar.g = cVar.g + 2 + b;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                                    }
                                }
                                cVar.k(updateDisplayLayoutKey);
                            } else {
                                if (updateDisplayLayoutKey.length() < 65536) {
                                    cVar.c((updateDisplayLayoutKey.length() * 6) + 5);
                                    int b2 = cVar.b(cVar.g + 3, updateDisplayLayoutKey);
                                    if (b2 >= 0) {
                                        if (b2 < 65536) {
                                            MessageBuffer messageBuffer5 = cVar.f;
                                            int i6 = cVar.g;
                                            cVar.g = i6 + 1;
                                            messageBuffer5.putByte(i6, (byte) -38);
                                            cVar.f.putShort(cVar.g, (short) b2);
                                            cVar.g = cVar.g + 2 + b2;
                                        } else if (b2 < 4294967296L) {
                                            MessageBuffer messageBuffer6 = cVar.f;
                                            int i7 = cVar.g;
                                            messageBuffer6.putMessageBuffer(i7 + 5, messageBuffer6, i7 + 3, b2);
                                            MessageBuffer messageBuffer7 = cVar.f;
                                            int i8 = cVar.g;
                                            cVar.g = i8 + 1;
                                            messageBuffer7.putByte(i8, (byte) -37);
                                            cVar.f.putInt(cVar.g, b2);
                                            cVar.g = cVar.g + 4 + b2;
                                        } else {
                                            throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                                        }
                                    }
                                }
                                cVar.k(updateDisplayLayoutKey);
                            }
                        } else {
                            cVar.k(updateDisplayLayoutKey);
                        }
                        ServerDisplayLayout layout = serverDisplayLayoutItem.getLayout();
                        if (layout.shouldStopStream()) {
                            cVar.h(1);
                        } else {
                            cVar.h(0);
                            cVar.m((byte) -64);
                            cVar.h(layout.getWidth());
                            cVar.h(layout.getHeight());
                            cVar.h(layout.getFit().serverCode);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("array size must be >= 0");
                }
            }
            cVar.m((byte) -64);
            return;
        }
        if (rtcCommand instanceof RequestAsrCommand) {
            cVar.h(3);
            cVar.h(0);
            cVar.i(j);
            cVar.m(((RequestAsrCommand) rtcCommand).start ? (byte) -61 : (byte) -62);
            return;
        }
        if (rtcCommand instanceof ReportNetworkStatCommand) {
            ReportNetworkStatCommand reportNetworkStatCommand = (ReportNetworkStatCommand) rtcCommand;
            cVar.h(4);
            cVar.h(0);
            cVar.i(j);
            cVar.i(reportNetworkStatCommand.timestamp);
            cVar.i(reportNetworkStatCommand.sendBitrate);
            return;
        }
        throw new IllegalArgumentException("No serializer for command: " + j + " " + rtcCommand.getClass());
    }

    public final RtcCommandSerializer.DeserializeResult a(byte[] bArr, RtcFormat rtcFormat) {
        RtcCommandSerializer.DeserializeResult a;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        }
        if (rtcFormat != null) {
            if (rtcFormat == RtcFormat.BINARY) {
                try {
                    b.c cVar = b.c;
                    cVar.getClass();
                    d dVar = new d(new ArrayBufferInput(bArr), cVar);
                    try {
                        int z = dVar.z();
                        int z2 = dVar.z();
                        int z3 = dVar.z();
                        if (z2 != 0) {
                            throw new UnsupportedOperationException("Unsupported version: " + z2 + " for command " + z);
                        }
                        if (z3 == 0) {
                            if (z != 0) {
                                a = z != 1 ? null : new RtcCommandSerializer.DeserializeResult(dVar.A(), new ReportPerfStatResponse(Integer.valueOf(dVar.z())));
                            } else {
                                a = a(dVar);
                            }
                            dVar.close();
                            return a;
                        }
                        throw new IllegalArgumentException("Error code " + z3 + " for command " + z);
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new IllegalArgumentException(go9.b("Unable to decode command body: ", Hex.toString(bArr)), th);
                }
            } else {
                throw new UnsupportedOperationException("Only binary format is supported");
            }
        } else {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
    }

    public final RtcCommandSerializer.DeserializeResult a(d dVar) {
        CallVideoTrackParticipantKey queryKey;
        UpdateDisplayLayoutV2Response.Error error;
        long A = dVar.A();
        HashMap hashMap = new HashMap();
        int E = dVar.E();
        for (int i = 0; i < E; i++) {
            ValueType h = dVar.n().h();
            h.getClass();
            if (h == ValueType.STRING) {
                String I = dVar.I();
                queryKey = SignalingProtocol.parseVideoTrackParticipantKey(I);
                if (queryKey == null) {
                    throw new IllegalArgumentException(go9.b("Not found video track participant key for ", I));
                }
            } else {
                int z = dVar.z();
                queryKey = this.a.queryKey(z);
                if (queryKey == null) {
                    throw new IllegalArgumentException(lhg.a(z, "Not found video track participant key for "));
                }
            }
            if (dVar.z() == -1) {
                error = UpdateDisplayLayoutV2Response.Error.NOT_ENOUGH_VIDEO_TRACKS;
            } else {
                error = UpdateDisplayLayoutV2Response.Error.UNKNOWN;
            }
            hashMap.put(queryKey, error);
        }
        return new RtcCommandSerializer.DeserializeResult(A, new UpdateDisplayLayoutV2Response(hashMap));
    }
}
