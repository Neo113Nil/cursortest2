package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.List;

/* compiled from: LazyStringList.java */
/* loaded from: classes13.dex */
public interface ayy extends List {
    Object getRaw(int i);

    List<?> getUnderlyingElements();

    ayy getUnmodifiableView();

    void w3(ByteString byteString);
}
