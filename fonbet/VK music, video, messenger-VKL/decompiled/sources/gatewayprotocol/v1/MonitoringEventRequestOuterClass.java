package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class MonitoringEventRequestOuterClass {

    public static final class MonitoringEvent extends GeneratedMessageLite<MonitoringEvent, Builder> implements MonitoringEventOrBuilder {
        private static final MonitoringEvent DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 4;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_NUMBER_FIELD_NUMBER = 1;
        public static final int MONITORING_ID_FIELD_NUMBER = 3;
        private static volatile Parser<MonitoringEvent> PARSER;
        private int bitField0_;
        private long durationMs_;
        private int eventType_;
        private long impressionNumber_;
        private int monitoringId_;

        public static final class Builder extends GeneratedMessageLite.Builder<MonitoringEvent, Builder> implements MonitoringEventOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearDurationMs() {
                copyOnWrite();
                ((MonitoringEvent) this.instance).clearDurationMs();
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                ((MonitoringEvent) this.instance).clearEventType();
                return this;
            }

            public Builder clearImpressionNumber() {
                copyOnWrite();
                ((MonitoringEvent) this.instance).clearImpressionNumber();
                return this;
            }

            public Builder clearMonitoringId() {
                copyOnWrite();
                ((MonitoringEvent) this.instance).clearMonitoringId();
                return this;
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public long getDurationMs() {
                return ((MonitoringEvent) this.instance).getDurationMs();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public MonitoringEventType getEventType() {
                return ((MonitoringEvent) this.instance).getEventType();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public int getEventTypeValue() {
                return ((MonitoringEvent) this.instance).getEventTypeValue();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public long getImpressionNumber() {
                return ((MonitoringEvent) this.instance).getImpressionNumber();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public int getMonitoringId() {
                return ((MonitoringEvent) this.instance).getMonitoringId();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
            public boolean hasDurationMs() {
                return ((MonitoringEvent) this.instance).hasDurationMs();
            }

            public Builder setDurationMs(long j) {
                copyOnWrite();
                ((MonitoringEvent) this.instance).setDurationMs(j);
                return this;
            }

            public Builder setEventType(MonitoringEventType monitoringEventType) {
                copyOnWrite();
                ((MonitoringEvent) this.instance).setEventType(monitoringEventType);
                return this;
            }

            public Builder setEventTypeValue(int i) {
                copyOnWrite();
                ((MonitoringEvent) this.instance).setEventTypeValue(i);
                return this;
            }

            public Builder setImpressionNumber(long j) {
                copyOnWrite();
                ((MonitoringEvent) this.instance).setImpressionNumber(j);
                return this;
            }

            public Builder setMonitoringId(int i) {
                copyOnWrite();
                ((MonitoringEvent) this.instance).setMonitoringId(i);
                return this;
            }

            private Builder() {
                super(MonitoringEvent.DEFAULT_INSTANCE);
            }
        }

        static {
            MonitoringEvent monitoringEvent = new MonitoringEvent();
            DEFAULT_INSTANCE = monitoringEvent;
            GeneratedMessageLite.registerDefaultInstance(MonitoringEvent.class, monitoringEvent);
        }

        private MonitoringEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDurationMs() {
            this.bitField0_ &= -2;
            this.durationMs_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventType() {
            this.eventType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionNumber() {
            this.impressionNumber_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoringId() {
            this.monitoringId_ = 0;
        }

        public static MonitoringEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MonitoringEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationMs(long j) {
            this.bitField0_ |= 1;
            this.durationMs_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventType(MonitoringEventType monitoringEventType) {
            this.eventType_ = monitoringEventType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionNumber(long j) {
            this.impressionNumber_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoringId(int i) {
            this.monitoringId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            a aVar = null;
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MonitoringEvent();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003\u0004\u0004ဂ\u0000", new Object[]{"bitField0_", "impressionNumber_", "eventType_", "monitoringId_", "durationMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MonitoringEvent> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MonitoringEvent.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public long getDurationMs() {
            return this.durationMs_;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public MonitoringEventType getEventType() {
            MonitoringEventType forNumber = MonitoringEventType.forNumber(this.eventType_);
            return forNumber == null ? MonitoringEventType.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public int getEventTypeValue() {
            return this.eventType_;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public long getImpressionNumber() {
            return this.impressionNumber_;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public int getMonitoringId() {
            return this.monitoringId_;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventOrBuilder
        public boolean hasDurationMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MonitoringEvent monitoringEvent) {
            return DEFAULT_INSTANCE.createBuilder(monitoringEvent);
        }

        public static MonitoringEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitoringEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MonitoringEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MonitoringEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MonitoringEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MonitoringEvent parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitoringEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MonitoringEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MonitoringEventOrBuilder extends MessageLiteOrBuilder {
        long getDurationMs();

        MonitoringEventType getEventType();

        int getEventTypeValue();

        long getImpressionNumber();

        int getMonitoringId();

        boolean hasDurationMs();
    }

    public static final class MonitoringEventRequest extends GeneratedMessageLite<MonitoringEventRequest, Builder> implements MonitoringEventRequestOrBuilder {
        private static final MonitoringEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int MONITORING_EVENT_FIELD_NUMBER = 3;
        private static volatile Parser<MonitoringEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private MonitoringEvent monitoringEvent_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        public static final class Builder extends GeneratedMessageLite.Builder<MonitoringEventRequest, Builder> implements MonitoringEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearMonitoringEvent() {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).clearMonitoringEvent();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((MonitoringEventRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public MonitoringEvent getMonitoringEvent() {
                return ((MonitoringEventRequest) this.instance).getMonitoringEvent();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((MonitoringEventRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((MonitoringEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public boolean hasMonitoringEvent() {
                return ((MonitoringEventRequest) this.instance).hasMonitoringEvent();
            }

            @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((MonitoringEventRequest) this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeMonitoringEvent(MonitoringEvent monitoringEvent) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).mergeMonitoringEvent(monitoringEvent);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setMonitoringEvent(MonitoringEvent monitoringEvent) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setMonitoringEvent(monitoringEvent);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            private Builder() {
                super(MonitoringEventRequest.DEFAULT_INSTANCE);
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setMonitoringEvent(MonitoringEvent.Builder builder) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setMonitoringEvent(builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((MonitoringEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }
        }

        static {
            MonitoringEventRequest monitoringEventRequest = new MonitoringEventRequest();
            DEFAULT_INSTANCE = monitoringEventRequest;
            GeneratedMessageLite.registerDefaultInstance(MonitoringEventRequest.class, monitoringEventRequest);
        }

        private MonitoringEventRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoringEvent() {
            this.monitoringEvent_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static MonitoringEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMonitoringEvent(MonitoringEvent monitoringEvent) {
            monitoringEvent.getClass();
            MonitoringEvent monitoringEvent2 = this.monitoringEvent_;
            if (monitoringEvent2 == null || monitoringEvent2 == MonitoringEvent.getDefaultInstance()) {
                this.monitoringEvent_ = monitoringEvent;
            } else {
                this.monitoringEvent_ = MonitoringEvent.newBuilder(this.monitoringEvent_).mergeFrom((MonitoringEvent.Builder) monitoringEvent).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MonitoringEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoringEvent(MonitoringEvent monitoringEvent) {
            monitoringEvent.getClass();
            this.monitoringEvent_ = monitoringEvent;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            a aVar = null;
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MonitoringEventRequest();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "monitoringEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MonitoringEventRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (MonitoringEventRequest.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public MonitoringEvent getMonitoringEvent() {
            MonitoringEvent monitoringEvent = this.monitoringEvent_;
            return monitoringEvent == null ? MonitoringEvent.getDefaultInstance() : monitoringEvent;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public boolean hasMonitoringEvent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.MonitoringEventRequestOuterClass.MonitoringEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MonitoringEventRequest monitoringEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(monitoringEventRequest);
        }

        public static MonitoringEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitoringEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MonitoringEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MonitoringEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MonitoringEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MonitoringEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MonitoringEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MonitoringEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MonitoringEventRequestOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        MonitoringEvent getMonitoringEvent();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasMonitoringEvent();

        boolean hasStaticDeviceInfo();
    }

    public enum MonitoringEventType implements Internal.EnumLite {
        MONITORING_EVENT_TYPE_UNSPECIFIED(0),
        MONITORING_EVENT_TYPE_OPEN(1),
        MONITORING_EVENT_TYPE_CLOSE(2),
        UNRECOGNIZED(-1);

        public static final int MONITORING_EVENT_TYPE_CLOSE_VALUE = 2;
        public static final int MONITORING_EVENT_TYPE_OPEN_VALUE = 1;
        public static final int MONITORING_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<MonitoringEventType> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<MonitoringEventType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final MonitoringEventType findValueByNumber(int i) {
                return MonitoringEventType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return MonitoringEventType.forNumber(i) != null;
            }
        }

        MonitoringEventType(int i) {
            this.value = i;
        }

        public static MonitoringEventType forNumber(int i) {
            if (i == 0) {
                return MONITORING_EVENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return MONITORING_EVENT_TYPE_OPEN;
            }
            if (i != 2) {
                return null;
            }
            return MONITORING_EVENT_TYPE_CLOSE;
        }

        public static Internal.EnumLiteMap<MonitoringEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static MonitoringEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private MonitoringEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
