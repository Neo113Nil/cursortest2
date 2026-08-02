package xsna;

import androidx.health.platform.client.proto.ByteString;
import androidx.health.platform.client.proto.CodedOutputStream;
import androidx.health.platform.client.proto.GeneratedMessageLite;
import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes12.dex */
public interface ja20 extends ma20 {
    void b(CodedOutputStream codedOutputStream) throws IOException;

    int getSerializedSize();

    GeneratedMessageLite.a newBuilderForType();

    ByteString.f toByteString();
}
