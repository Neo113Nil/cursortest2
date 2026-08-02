package xsna;

import com.vk.dto.music.audiobook.AudioBook;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class md4 implements izs<Object, Boolean> {
    public static final md4 b = new md4();

    @Override // xsna.izs
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof AudioBook);
    }
}
