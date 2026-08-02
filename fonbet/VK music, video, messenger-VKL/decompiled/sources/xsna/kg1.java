package xsna;

import com.vk.dto.music.audiobook.AudioBook;

/* compiled from: RxExt.kt */
/* loaded from: classes4.dex */
public final class kg1 implements izs {
    public static final kg1 c = new kg1(0);
    public static final kg1 d = new kg1(1);
    public static final kg1 e = new kg1(2);
    public static final kg1 f = new kg1(3);
    public final /* synthetic */ int b;

    public /* synthetic */ kg1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof s4a0);
            case 1:
                return Boolean.valueOf(obj instanceof AudioBook);
            case 2:
                ((Number) obj).intValue();
                return null;
            default:
                return Boolean.valueOf(obj instanceof p980);
        }
    }
}
