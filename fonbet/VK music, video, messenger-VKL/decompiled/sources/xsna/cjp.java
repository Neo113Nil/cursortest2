package xsna;

import androidx.annotation.NonNull;
import xsna.cjp;

/* compiled from: EncoderConfig.java */
/* loaded from: classes.dex */
public interface cjp<T extends cjp<T>> {
    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull mp70<? super U> mp70Var);
}
