package xsna;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface la20 extends oa20 {
    void b(CodedOutputStream codedOutputStream) throws IOException;

    int getSerializedSize();

    GeneratedMessageLite.a newBuilderForType();

    ByteString.g toByteString();
}
