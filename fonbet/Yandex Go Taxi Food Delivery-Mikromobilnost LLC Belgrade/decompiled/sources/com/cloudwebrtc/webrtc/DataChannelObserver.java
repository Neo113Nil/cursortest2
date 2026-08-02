package com.cloudwebrtc.webrtc;

import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import defpackage.afo;
import defpackage.oyr;
import defpackage.tt5;
import defpackage.xeo;
import defpackage.zeo;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.DataChannel;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
class DataChannelObserver implements DataChannel.Observer, zeo {
    private final DataChannel dataChannel;
    private final afo eventChannel;
    private final ArrayList eventQueue = new ArrayList();
    private xeo eventSink;
    private final String flutterId;

    /* renamed from: com.cloudwebrtc.webrtc.DataChannelObserver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$DataChannel$State;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            $SwitchMap$org$webrtc$DataChannel$State = iArr;
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$DataChannel$State[DataChannel.State.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DataChannelObserver(tt5 tt5Var, String str, String str2, DataChannel dataChannel) {
        this.flutterId = str2;
        this.dataChannel = dataChannel;
        afo afoVar = new afo(tt5Var, oyr.p("FlutterWebRTC/dataChannelEvent", str, str2));
        this.eventChannel = afoVar;
        afoVar.a(this);
    }

    private String dataChannelStateString(DataChannel.State state) {
        int i = AnonymousClass1.$SwitchMap$org$webrtc$DataChannel$State[state.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "closed" : "closing" : OpenList.STR_OPEN : "connecting";
    }

    private void sendEvent(ConstraintsMap constraintsMap) {
        xeo xeoVar = this.eventSink;
        if (xeoVar != null) {
            xeoVar.success(constraintsMap.toMap());
        } else {
            this.eventQueue.add(constraintsMap.toMap());
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j) {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dataChannelBufferedAmountChange");
        constraintsMap.putInt("id", this.dataChannel.id());
        constraintsMap.putLong("bufferedAmount", this.dataChannel.bufferedAmount());
        constraintsMap.putLong("changedAmount", j);
        sendEvent(constraintsMap);
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        this.eventSink = new AnyThreadSink(xeoVar);
        Iterator it = this.eventQueue.iterator();
        while (it.hasNext()) {
            this.eventSink.success(it.next());
        }
        this.eventQueue.clear();
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        byte[] bArr;
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dataChannelReceiveMessage");
        constraintsMap.putInt("id", this.dataChannel.id());
        boolean hasArray = buffer.data.hasArray();
        ByteBuffer byteBuffer = buffer.data;
        if (hasArray) {
            bArr = byteBuffer.array();
        } else {
            bArr = new byte[byteBuffer.remaining()];
            buffer.data.get(bArr);
        }
        if (buffer.binary) {
            constraintsMap.putString("type", BuildConfig.SDK_DEPENDENCY);
            constraintsMap.putByte(Constants.KEY_DATA, bArr);
        } else {
            constraintsMap.putString("type", "text");
            constraintsMap.putString(Constants.KEY_DATA, new String(bArr, StandardCharsets.UTF_8));
        }
        sendEvent(constraintsMap);
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dataChannelStateChanged");
        constraintsMap.putInt("id", this.dataChannel.id());
        constraintsMap.putString(ClidProvider.STATE, dataChannelStateString(this.dataChannel.state()));
        sendEvent(constraintsMap);
    }
}
