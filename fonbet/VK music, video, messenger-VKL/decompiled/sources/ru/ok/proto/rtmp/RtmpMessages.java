package ru.ok.proto.rtmp;

import android.os.Build;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.media.GrafikaRuntimeConfig;
import ru.ok.proto.messages.ProtoMessageBase;
import ru.ok.proto.rtmp.amf.entries.AmfMessageBase;
import ru.ok.proto.rtmp.amf.entries.AmfNull;
import ru.ok.proto.rtmp.amf.entries.AmfNumber;
import ru.ok.proto.rtmp.amf.entries.AmfObject;
import ru.ok.proto.rtmp.amf.entries.AmfObjectBase;
import ru.ok.proto.rtmp.amf.entries.AmfString;
import xsna.l370;

/* loaded from: classes9.dex */
public class RtmpMessages {

    public static class ConnectCommandObject extends AmfObjectBase {
        private final AmfString codecs;
        private final AmfString netType;

        /* renamed from: app, reason: collision with root package name */
        private final AmfString f110app = new AmfString(LoginRequest.CLIENT_NAME);
        private final AmfString flashver = new AmfString("Android/ru.ok.media/release/" + GrafikaRuntimeConfig.DEBUG + DomExceptionUtils.SEPARATOR + GrafikaRuntimeConfig.VERSION_CODE + "/build" + GrafikaRuntimeConfig.BUILD_NUMBER);
        private final AmfString swfUrl = new AmfString("dummy.swf");
        private final AmfString tcUrl = new AmfString("rtmp://127.0.0.1");
        private final AmfString deviceBrand = new AmfString(Build.BRAND);
        private final AmfString deviceManufacturer = new AmfString(Build.MANUFACTURER);
        private final AmfString deviceModel = new AmfString(Build.MODEL);

        public ConnectCommandObject() {
            String A = l370.A();
            this.codecs = new AmfString(A == null ? "null" : A);
            this.netType = new AmfString("na");
        }

        public void setApp(String str) {
            this.f110app.setValue(str);
        }

        public void setNetType(String str) {
            this.netType.setValue(str);
        }

        public void setTcUrl(String str) {
            this.tcUrl.setValue(str);
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase
        public void visit(AmfObjectBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f110app);
            visitor.visit("flashVer", this.flashver);
            visitor.visit("swfUrl", this.swfUrl);
            visitor.visit("tcUrl", this.tcUrl);
            visitor.visit("deviceBrand", this.deviceBrand);
            visitor.visit("deviceManufacturer", this.deviceManufacturer);
            visitor.visit("deviceModel", this.deviceModel);
            visitor.visit("codecs", this.codecs);
            visitor.visit("netType", this.netType);
        }
    }

    public static class ConnectRequest extends ProtoMessageBase {
        private final ConnectCommandObject commandObject;

        public ConnectRequest() {
            super("connect");
            this.commandObject = new ConnectCommandObject();
        }

        public ConnectCommandObject getCommandObject() {
            return this.commandObject;
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(this.commandObject);
        }
    }

    public static class CreateStreamRequest extends ProtoMessageBase {
        public CreateStreamRequest() {
            super("createStream");
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
        }
    }

    public static class CreateStreamResponse extends ProtoMessageBase {
        private AmfNumber streamId = new AmfNumber();

        public double getStreamId() {
            return this.streamId.getValue();
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamId);
        }
    }

    public static class FCPublishRequest extends ProtoMessageBase {
        private AmfString streamName;

        public FCPublishRequest(String str) {
            super("FCPublish");
            this.streamName = new AmfString(str);
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamName);
        }
    }

    public static class PlayMessage extends ProtoMessageBase {
        private AmfString streamName;

        public PlayMessage(String str) {
            super("play");
            this.streamName = new AmfString(str);
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamName);
        }
    }

    public static class PublishMessage extends ProtoMessageBase {
        private AmfString publishType;
        private AmfString streamName;

        public PublishMessage(String str, String str2) {
            super("publish");
            this.streamName = new AmfString(str);
            this.publishType = new AmfString(str2);
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamName);
            visitor.visit(this.publishType);
        }
    }

    public static class ReleaseStreamRequest extends ProtoMessageBase {
        private AmfString streamName;

        public ReleaseStreamRequest(String str) {
            super("releaseStream");
            this.streamName = new AmfString(str);
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamName);
        }
    }

    public static class ServerResponse extends ProtoMessageBase {
        private final AmfObjectBase properties = new AmfObjectBase();
        private final ServerResponseInformationObject information = new ServerResponseInformationObject();

        public ServerResponseInformationObject getInformation() {
            return this.information;
        }

        public boolean isError() {
            return "error".equalsIgnoreCase(getInformation().getLevel());
        }

        public boolean isStatus() {
            return "status".equalsIgnoreCase(getInformation().getLevel());
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(this.properties);
            visitor.visit(this.information);
        }
    }

    public static class ServerResponseInformationObject extends AmfObjectBase {
        private final AmfString level = new AmfString();
        private final AmfString code = new AmfString();
        private final AmfString description = new AmfString();
        private final AmfString result = new AmfString();
        private final AmfString reason = new AmfString();

        public String getCode() {
            return this.code.getValue();
        }

        public String getLevel() {
            return this.level.getValue();
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase
        public void visit(AmfObjectBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit("level", this.level);
            visitor.visit("code", this.code);
            visitor.visit("description", this.description);
            visitor.visit("result", this.result);
            visitor.visit("reason", this.reason);
        }
    }

    public static class SetDataFrameMessage extends AmfMessageBase {
        public static final AmfString MESSAGE_NAME = new AmfString("@setDataFrame");
        private AmfString name;
        private AmfObject values;

        public SetDataFrameMessage(String str, Map<String, Object> map) {
            this.name = new AmfString(str);
            this.values = new AmfObject(map);
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(MESSAGE_NAME);
            visitor.visit(this.name);
            visitor.visit(this.values);
        }
    }

    public static class UnpublishMessage extends ProtoMessageBase {
        private AmfString streamName;

        public UnpublishMessage(String str) {
            super("FCUnpublish");
            this.streamName = new AmfString(str);
        }

        @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
        public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
            super.visit(visitor);
            visitor.visit(AmfNull.INSTANCE);
            visitor.visit(this.streamName);
        }
    }
}
