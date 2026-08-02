package xsna;

import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: FeedDigestInversedTransformer.kt */
/* loaded from: classes4.dex */
public final class cyq implements gn60<Triple<? extends DigestItem, ? extends Digest, ? extends xah0>, wm60> {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new a44(17));

    public static baf0 a(int i, String str) {
        if (str == null || str.length() == 0) {
            return new baf0(m33.a(i, e43.a), dhr0.t.c(R.attr.vk_ui_icon_secondary));
        }
        return null;
    }

    public static baf0 b(int i, String str) {
        return new baf0(m33.a(i, e43.a), (str == null || str.length() == 0) ? dhr0.t.c(R.attr.vk_ui_icon_secondary) : -1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v9 xsna.ayq, still in use, count: 2, list:
          (r11v9 xsna.ayq) from 0x02da: MOVE (r3v10 xsna.ayq) = (r11v9 xsna.ayq) (LINE:731)
          (r11v9 xsna.ayq) from 0x02b6: MOVE (r3v16 xsna.ayq) = (r11v9 xsna.ayq) (LINE:695)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    public final java.util.List c(int r31, kotlin.Triple r32) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.cyq.c(int, kotlin.Triple):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return c(0, (Triple) pair);
    }
}
