package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.ap$b;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.f;
import one.video.calls.sdk_private.u;
import xsna.sky;

/* compiled from: HandshakeMessage.java */
/* loaded from: classes8.dex */
public abstract class bdy0 {
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0623 A[LOOP:6: B:214:0x03df->B:227:0x0623, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x062b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0660 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06ae A[LOOP:0: B:5:0x0020->B:35:0x06ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x06b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(ByteBuffer byteBuffer, f.d dVar, qw80 qw80Var) throws one.video.calls.sdk_private.g {
        int i;
        short s;
        int position;
        int i2;
        final f.d dVar2 = dVar;
        qw80 qw80Var2 = qw80Var;
        int i3 = 2;
        if (byteBuffer.remaining() < 2) {
            throw new one.video.calls.sdk_private.j("Extension field must be at least 2 bytes long");
        }
        ArrayList arrayList = new ArrayList();
        short s2 = 65535;
        int i4 = byteBuffer.getShort() & 65535;
        if (byteBuffer.remaining() < i4) {
            throw new one.video.calls.sdk_private.j("Extensions too short");
        }
        while (i4 >= 4) {
            int i5 = byteBuffer.getShort() & s2;
            int i6 = byteBuffer.getShort() & s2;
            int i7 = i4 - 4;
            if (i6 > i7) {
                throw new one.video.calls.sdk_private.j("Extension length exceeds extensions length");
            }
            int position2 = byteBuffer.position();
            f.c cVar = f.c.server_name;
            one.video.calls.sdk_private.y yVar = null;
            short s3 = s2;
            int i8 = 1;
            if (i5 == cVar.k) {
                nwg0 nwg0Var = new nwg0();
                int a = nwg0Var.a(byteBuffer, cVar.k, 0);
                if (a <= 0) {
                    nwg0Var.a = null;
                } else {
                    if (a < i3) {
                        throw new one.video.calls.sdk_private.j("incorrect extension length");
                    }
                    int i9 = byteBuffer.getShort();
                    if (a != i9 + 2) {
                        throw new one.video.calls.sdk_private.j("inconsistent length");
                    }
                    while (i9 > 0) {
                        nwg0.c(i8, byteBuffer);
                        if (byteBuffer.get() != 0) {
                            nwg0.c(i3, byteBuffer);
                            i2 = byteBuffer.getShort() & s3;
                            nwg0.c(i2, byteBuffer);
                            if (i2 > byteBuffer.remaining()) {
                                throw new one.video.calls.sdk_private.j("extension underflow");
                            }
                            byteBuffer.get(new byte[i2]);
                        } else {
                            nwg0.c(i3, byteBuffer);
                            i2 = byteBuffer.getShort() & s3;
                            nwg0.c(i2, byteBuffer);
                            byte[] bArr = new byte[i2];
                            byteBuffer.get(bArr);
                            nwg0Var.a = new String(bArr, Charset.forName("ASCII"));
                        }
                        i9 -= i2 + 3;
                        i8 = 1;
                    }
                    if (i9 < 0) {
                        throw new one.video.calls.sdk_private.j("inconsistent length");
                    }
                }
                arrayList.add(nwg0Var);
            } else if (i5 == f.c.supported_groups.k) {
                arrayList.add(new h6r0(byteBuffer));
            } else {
                f.c cVar2 = f.c.signature_algorithms;
                if (i5 == cVar2.k) {
                    final rvp0 rvp0Var = new rvp0();
                    rvp0Var.a = new ArrayList();
                    int a2 = rvp0Var.a(byteBuffer, cVar2.k, 4);
                    short s4 = byteBuffer.getShort();
                    if (a2 != s4 + 2) {
                        throw new one.video.calls.sdk_private.j("inconsistent length");
                    }
                    if (s4 % 2 != 0) {
                        throw new one.video.calls.sdk_private.j("invalid group length");
                    }
                    for (int i10 = 0; i10 < s4; i10 += 2) {
                        Arrays.stream(f.g.values()).filter(new uuy0(byteBuffer.getShort() % s3)).findFirst().ifPresent(new Consumer() { // from class: xsna.nvp0
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                rvp0.this.a.add((f.g) obj);
                            }
                        });
                    }
                    arrayList.add(rvp0Var);
                } else if (i5 == f.c.application_layer_protocol_negotiation.k) {
                    arrayList.add(new twx(byteBuffer));
                } else {
                    f.c cVar3 = f.c.pre_shared_key;
                    if (i5 != cVar3.k) {
                        i = i7;
                        f.c cVar4 = f.c.early_data;
                        if (i5 == cVar4.k) {
                            sb00 sb00Var = new sb00();
                            int a3 = sb00Var.a(byteBuffer, cVar4.k, 0);
                            if (dVar2 == f.d.new_session_ticket) {
                                if (a3 != 4) {
                                    throw new one.video.calls.sdk_private.j("invalid extension data length");
                                }
                                sb00Var.a = Long.valueOf(byteBuffer.getInt() & 4294967295L);
                            } else if (a3 != 0) {
                                throw new one.video.calls.sdk_private.j("invalid extension data length");
                            }
                            arrayList.add(sb00Var);
                        } else if (i5 == f.c.supported_versions.k) {
                            arrayList.add(new y7x0(byteBuffer, dVar2));
                        } else if (i5 == f.c.psk_key_exchange_modes.k) {
                            arrayList.add(new wse0(byteBuffer));
                        } else if (i5 == f.c.certificate_authorities.k) {
                            arrayList.add(new acy(byteBuffer));
                        } else {
                            f.c cVar5 = f.c.key_share;
                            if (i5 == cVar5.k) {
                                one.video.calls.sdk_private.b bVar = new one.video.calls.sdk_private.b();
                                bVar.b = new ArrayList();
                                int a4 = bVar.a(byteBuffer, cVar5.k, 1);
                                if (a4 < 2) {
                                    throw new one.video.calls.sdk_private.j("extension underflow");
                                }
                                if (dVar2 == f.d.client_hello) {
                                    int i11 = byteBuffer.getShort();
                                    if (a4 != i11 + 2) {
                                        throw new one.video.calls.sdk_private.j("inconsistent length");
                                    }
                                    while (i11 > 0) {
                                        i11 -= bVar.c(byteBuffer);
                                    }
                                    if (i11 != 0) {
                                        throw new one.video.calls.sdk_private.j("inconsistent length");
                                    }
                                } else {
                                    if (dVar2 != f.d.server_hello) {
                                        throw new IllegalArgumentException();
                                    }
                                    if (a4 - bVar.c(byteBuffer) != 0) {
                                        throw new one.video.calls.sdk_private.j("inconsistent length");
                                    }
                                }
                                arrayList.add(bVar);
                            } else {
                                if (qw80Var2 != null) {
                                    wby0 wby0Var = (wby0) qw80Var2.c;
                                    short s5 = byteBuffer.getShort();
                                    int i12 = s5 & s3;
                                    int i13 = wby0Var.a.a.a;
                                    if (i13 == 1 || i13 == 1798521807 ? i12 == 57 : i12 == 65445) {
                                        yVar = new one.video.calls.sdk_private.y(wby0Var.a.a);
                                        one.video.calls.sdk_private.u uVar = yVar.d;
                                        int i14 = byteBuffer.getShort() & s3;
                                        int i15 = yVar.a.a;
                                        if (i15 == 1 || i15 == 1798521807) {
                                            if (i14 != 57) {
                                                throw new RuntimeException();
                                            }
                                            s = byteBuffer.getShort();
                                            position = byteBuffer.position();
                                            HashSet hashSet = new HashSet();
                                            while (byteBuffer.position() - position < s) {
                                                try {
                                                    long l = alk.l(byteBuffer);
                                                    if (!hashSet.add(Long.valueOf(l))) {
                                                        throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "duplicate transport parameter");
                                                    }
                                                    int i16 = alk.i(byteBuffer);
                                                    if (byteBuffer.remaining() < i16) {
                                                        throw new one.video.calls.sdk_private.j("Invalid transport parameter extension");
                                                    }
                                                    int position3 = byteBuffer.position();
                                                    if (l == ap$b.original_destination_connection_id.s) {
                                                        byte[] bArr2 = new byte[i16];
                                                        byteBuffer.get(bArr2);
                                                        uVar.a = bArr2;
                                                    } else if (l == ap$b.max_idle_timeout.s) {
                                                        uVar.b = alk.l(byteBuffer);
                                                    } else if (l == ap$b.stateless_reset_token.s) {
                                                        byte[] bArr3 = new byte[16];
                                                        byteBuffer.get(bArr3);
                                                        kq01.b(bArr3);
                                                        uVar.q = bArr3;
                                                    } else if (l == ap$b.max_udp_payload_size.s) {
                                                        uVar.p = alk.i(byteBuffer);
                                                    } else if (l == ap$b.initial_max_data.s) {
                                                        uVar.c = alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_max_stream_data_bidi_local.s) {
                                                        uVar.d = alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_max_stream_data_bidi_remote.s) {
                                                        uVar.e = alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_max_stream_data_uni.s) {
                                                        uVar.f = alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_max_streams_bidi.s) {
                                                        uVar.g = alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_max_streams_uni.s) {
                                                        uVar.h = alk.l(byteBuffer);
                                                    } else if (l == ap$b.ack_delay_exponent.s) {
                                                        uVar.i = alk.i(byteBuffer);
                                                    } else if (l == ap$b.max_ack_delay.s) {
                                                        uVar.l = alk.i(byteBuffer);
                                                    } else if (l == ap$b.disable_active_migration.s) {
                                                        uVar.j = true;
                                                    } else if (l == ap$b.preferred_address.s) {
                                                        yVar.c(byteBuffer);
                                                    } else if (l == ap$b.active_connection_id_limit.s) {
                                                        uVar.m = (int) alk.l(byteBuffer);
                                                    } else if (l == ap$b.initial_source_connection_id.s) {
                                                        byte[] bArr4 = new byte[i16];
                                                        byteBuffer.get(bArr4);
                                                        kq01.b(bArr4);
                                                        uVar.n = bArr4;
                                                    } else if (l == ap$b.retry_source_connection_id.s) {
                                                        byte[] bArr5 = new byte[i16];
                                                        byteBuffer.get(bArr5);
                                                        kq01.b(bArr5);
                                                        uVar.o = bArr5;
                                                    } else {
                                                        if (l == ap$b.version_information.s) {
                                                            if (i16 % 4 != 0 || i16 < 4) {
                                                                throw new one.video.calls.sdk_private.j("invalid parameters size");
                                                            }
                                                            int i17 = byteBuffer.getInt();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (int i18 = 0; i18 < (i16 / 4) - 1; i18++) {
                                                                arrayList2.add(new kgy0(byteBuffer.getInt()));
                                                            }
                                                            uVar.r = new u.b(new kgy0(i17), arrayList2);
                                                        } else if (l == 32) {
                                                            uVar.s = alk.l(byteBuffer);
                                                        } else {
                                                            String str = l == 32 ? "datagram" : "";
                                                            if (l == 64) {
                                                                str = "multi-path";
                                                            }
                                                            if (l == 4183) {
                                                                str = "loss-bits";
                                                            }
                                                            if (l == 5950) {
                                                                str = "discard";
                                                            }
                                                            if (l == 10930) {
                                                                str = "grease-quic-bit";
                                                            }
                                                            if (l == 29015) {
                                                                str = "timestamp";
                                                            }
                                                            String str2 = l != 29016 ? str : "timestamp";
                                                            if (l == 29659) {
                                                                str2 = "version-negotiation";
                                                            }
                                                            String str3 = "delayed-ack";
                                                            if (l == 56858) {
                                                                str2 = "delayed-ack";
                                                            }
                                                            if (l == 16741339) {
                                                                str2 = "version-information-4-13";
                                                            }
                                                            if (l != 4278378010L) {
                                                                str3 = str2;
                                                            }
                                                            int length = str3.length();
                                                            int i19 = 0;
                                                            while (true) {
                                                                if (i19 >= length) {
                                                                    String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(l), Integer.valueOf(i16));
                                                                    break;
                                                                }
                                                                int codePointAt = str3.codePointAt(i19);
                                                                if (!Character.isWhitespace(codePointAt)) {
                                                                    String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(l), Integer.valueOf(i16), str3);
                                                                    break;
                                                                }
                                                                i19 = Character.charCount(codePointAt) + i19;
                                                            }
                                                            byteBuffer.get(new byte[i16]);
                                                        }
                                                        if (byteBuffer.position() - position3 == i16) {
                                                            throw new one.video.calls.sdk_private.j("inconsistent size in transport parameter");
                                                        }
                                                    }
                                                    if (byteBuffer.position() - position3 == i16) {
                                                    }
                                                } catch (bJ e) {
                                                    throw new one.video.calls.sdk_private.g(e.getMessage(), e);
                                                } catch (one.video.calls.sdk_private.bq unused) {
                                                    throw new one.video.calls.sdk_private.j("invalid integer encoding in transport parameter extension");
                                                }
                                            }
                                            if (byteBuffer.position() - position != s) {
                                                throw new one.video.calls.sdk_private.j("inconsistent size in transport parameter extension");
                                            }
                                        } else {
                                            if (i14 != 65445) {
                                                throw new RuntimeException();
                                            }
                                            s = byteBuffer.getShort();
                                            position = byteBuffer.position();
                                            HashSet hashSet2 = new HashSet();
                                            while (byteBuffer.position() - position < s) {
                                            }
                                            if (byteBuffer.position() - position != s) {
                                            }
                                        }
                                    }
                                }
                                if (yVar != null) {
                                    arrayList.add(yVar);
                                } else {
                                    t3y0 t3y0Var = new t3y0();
                                    if (byteBuffer.remaining() < 4) {
                                        throw new one.video.calls.sdk_private.j("Extension must be at least 4 bytes long");
                                    }
                                    byteBuffer.getShort();
                                    int i20 = byteBuffer.getShort() & s3;
                                    if (byteBuffer.remaining() < i20) {
                                        throw new one.video.calls.sdk_private.j("Invalid extension length");
                                    }
                                    byteBuffer.get(new byte[i20 + 4]);
                                    arrayList.add(t3y0Var);
                                }
                            }
                        }
                    } else if (dVar2 == f.d.server_hello) {
                        orn0 orn0Var = new orn0();
                        orn0Var.a(byteBuffer, cVar3.k, i3);
                        orn0Var.a = byteBuffer.getShort();
                        arrayList.add(orn0Var);
                    } else {
                        if (dVar2 != f.d.client_hello) {
                            throw new one.video.calls.sdk_private.n(cqi.c(Arrays.stream(f.d.values()).filter(new Predicate() { // from class: xsna.zcy0
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return ((f.d) obj).i == f.d.this.i;
                                }
                            }).findFirst().get(), "Extension not allowed in "));
                        }
                        sky skyVar = new sky();
                        int position4 = byteBuffer.position();
                        int a5 = skyVar.a(byteBuffer, cVar3.k, 44);
                        skyVar.a = new ArrayList();
                        int i21 = byteBuffer.getShort() & s3;
                        int i22 = a5 - i3;
                        while (i21 > 0) {
                            if (i22 < i3) {
                                throw new one.video.calls.sdk_private.j("Incomplete psk identity");
                            }
                            int i23 = byteBuffer.getShort() & s3;
                            int i24 = i22 - 2;
                            if (i23 > i24) {
                                throw new one.video.calls.sdk_private.j("Incorrect identity length value");
                            }
                            byte[] bArr6 = new byte[i23];
                            byteBuffer.get(bArr6);
                            int i25 = i24 - i23;
                            if (i25 < 4) {
                                throw new one.video.calls.sdk_private.j("Incomplete psk identity");
                            }
                            skyVar.a.add(new sky.b(byteBuffer.getInt(), bArr6));
                            i21 -= i23 + 6;
                            i22 = i25 - 4;
                            i7 = i7;
                            i3 = 2;
                        }
                        i = i7;
                        if (i21 != 0) {
                            throw new one.video.calls.sdk_private.j("Incorrect identities length value");
                        }
                        skyVar.c = byteBuffer.position() - position4;
                        skyVar.b = new ArrayList();
                        if (i22 < 2) {
                            throw new one.video.calls.sdk_private.j("Incomplete binders");
                        }
                        int i26 = byteBuffer.getShort() & s3;
                        int i27 = i22 - 2;
                        while (i26 > 0) {
                            if (i27 <= 0) {
                                throw new one.video.calls.sdk_private.j("Incorrect binder value");
                            }
                            int i28 = byteBuffer.get() & 255;
                            int i29 = i27 - 1;
                            if (i28 > i29) {
                                throw new one.video.calls.sdk_private.j("Incorrect binder length value");
                            }
                            if (i28 < 32) {
                                throw new one.video.calls.sdk_private.j("Invalid binder length");
                            }
                            byte[] bArr7 = new byte[i28];
                            byteBuffer.get(bArr7);
                            i27 = i29 - i28;
                            skyVar.b.add(new sky.a(bArr7));
                            i26 -= i28 + 1;
                        }
                        if (i26 != 0) {
                            throw new one.video.calls.sdk_private.j("Incorrect binders length value");
                        }
                        if (i27 > 0) {
                            throw new one.video.calls.sdk_private.j("Incorrect extension data length value");
                        }
                        if (skyVar.a.size() != skyVar.b.size()) {
                            throw new one.video.calls.sdk_private.j("Inconsistent number of identities vs binders");
                        }
                        if (skyVar.a.size() == 0) {
                            throw new one.video.calls.sdk_private.j("Empty OfferedPsks");
                        }
                        arrayList.add(skyVar);
                    }
                    if (byteBuffer.position() - position2 == i6 + 4) {
                        throw new one.video.calls.sdk_private.j("Incorrect extension length");
                    }
                    i4 = i - i6;
                    dVar2 = dVar;
                    qw80Var2 = qw80Var;
                    s2 = s3;
                    i3 = 2;
                }
            }
            i = i7;
            if (byteBuffer.position() - position2 == i6 + 4) {
            }
        }
        return arrayList;
    }

    public final int a(ByteBuffer byteBuffer, f.d dVar, int i) throws one.video.calls.sdk_private.j {
        if (byteBuffer.remaining() < 4) {
            throw new one.video.calls.sdk_private.j("handshake message underflow");
        }
        if ((byteBuffer.get() & 255) != dVar.i) {
            throw new IllegalStateException();
        }
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (i2 + 4 >= i) {
            if (byteBuffer.remaining() >= i2) {
                return i2;
            }
            throw new one.video.calls.sdk_private.j("handshake message underflow");
        }
        throw new one.video.calls.sdk_private.j(getClass().getSimpleName() + " can't be less than " + i + " bytes");
    }

    public abstract f.d c();

    public abstract byte[] d();
}
