package xsna;

import com.vk.dto.stickers.StickersDictionaryItemLight;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DictionaryItemEntity.kt */
/* loaded from: classes5.dex */
public final class dxm {
    public final List<String> a;
    public final List<StickersDictionaryItemLight.DictionaryStickerModel> b;
    public final boolean c;

    public dxm(List<String> list, List<StickersDictionaryItemLight.DictionaryStickerModel> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxm)) {
            return false;
        }
        dxm dxmVar = (dxm) obj;
        return epx.f(this.a, dxmVar.a) && epx.f(this.b, dxmVar.b) && this.c == dxmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DictionaryItemEntity(words=");
        sb.append(this.a);
        sb.append(", stickers=");
        sb.append(this.b);
        sb.append(", isSpecialItems=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dxm() {
        this(r0, r0, false);
        EmptyList emptyList = EmptyList.b;
    }
}
