package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes13.dex */
public final class z8e0 implements ujr0 {
    public boolean a = false;
    public boolean b = false;
    public f7r c;
    public final com.google.firebase.encoders.proto.b d;

    public z8e0(com.google.firebase.encoders.proto.b bVar) {
        this.d = bVar;
    }

    @Override // xsna.ujr0
    @NonNull
    public final ujr0 add(@Nullable String str) throws IOException {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.d(this.c, str, this.b);
        return this;
    }

    @Override // xsna.ujr0
    @NonNull
    public final ujr0 add(boolean z) throws IOException {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
