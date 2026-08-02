package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface ka20 extends na20 {
    GeneratedMessageLite.a e();

    void f(CodedOutputStream.a aVar) throws IOException;

    int getSerializedSize();

    GeneratedMessageLite.a i();

    byte[] toByteArray();

    ByteString.g toByteString();
}
