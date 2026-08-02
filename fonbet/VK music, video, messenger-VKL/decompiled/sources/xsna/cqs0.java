package xsna;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.eqs0;
import xsna.fqs0;
import xsna.oui;

/* compiled from: VideoInfoFormatter.kt */
/* loaded from: classes14.dex */
public final class cqs0 {
    public final boolean a;
    public final com.vk.core.utils.b b;
    public final Object c;

    public cqs0() {
        this(null, 3);
    }

    public static ListBuilder a(fqs0 fqs0Var, List list) {
        ListBuilder e = e43.e();
        Integer num = fqs0Var.a;
        e.add(new eqs0.a(list, num != null ? new oui.a(num.intValue()) : oui.b.a));
        CharSequence charSequence = fqs0Var.b;
        if (charSequence != null) {
            e.add(new eqs0.c(charSequence));
        }
        return e.g();
    }

    public static CharSequence e(Context context, VideoFile videoFile) {
        if (!videoFile.Y().b) {
            return "";
        }
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        baf0 f = VerifyInfoHelper.f(context, VerifyInfoHelper.ColorTheme.normal, videoFile.Y());
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        f.setBounds(0, 0, f.getIntrinsicWidth(), f.getIntrinsicHeight());
        newSpannable.setSpan(new tzx0(f, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) newSpannable);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.builders.ListBuilder] */
    public static zps0 f(cqs0 cqs0Var, VideoFile videoFile, Context context, String str, fqs0 fqs0Var, int i) {
        ?? a;
        if ((i & 4) != 0) {
            str = context.getString(R.string.live_counters_separator);
        }
        if ((i & 8) != 0) {
            fqs0Var = null;
        }
        CharSequence d = cqs0Var.d(context, videoFile);
        CharSequence g = cqs0Var.g(context, videoFile);
        boolean h = h(videoFile);
        ArrayList o = e43.o(new eqs0.b(d, ""));
        if (h) {
            o.add(new eqs0.c(videoFile.S3()));
        } else {
            o.add(new eqs0.c(g));
        }
        if (fqs0Var != null && (a = a(fqs0Var, o)) != 0) {
            o = a;
        }
        return new zps0(str, o);
    }

    public static boolean h(VideoFile videoFile) {
        String S3 = videoFile.S3();
        return !(S3 == null || drm0.N(S3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.builders.ListBuilder] */
    public final zps0 b(VideoFile videoFile, Context context, boolean z, fqs0 fqs0Var) {
        ?? a;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new eqs0.b(d(context, videoFile), e(context, videoFile)));
        }
        if (!videoFile.q0()) {
            CharSequence g = g(context, videoFile);
            gpt0 gpt0Var = gpt0.a;
            arrayList.addAll(e43.l(new eqs0.c(g), new eqs0.c(gpt0.k(context, videoFile))));
        }
        if (fqs0Var != null && (a = a(fqs0Var, arrayList)) != 0) {
            arrayList = a;
        }
        return new zps0("\n", arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.collections.builders.ListBuilder] */
    public final zps0 c(VideoFile videoFile, Context context, fqs0 fqs0Var) {
        ?? a;
        String string = context.getString(R.string.live_counters_separator);
        CharSequence d = d(context, videoFile);
        fqs0.a aVar = fqs0Var != null ? fqs0Var.c : null;
        if (aVar != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(aVar.a);
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.append(d);
            d = spannableStringBuilder;
        }
        CharSequence e = e(context, videoFile);
        CharSequence g = g(context, videoFile);
        gpt0 gpt0Var = gpt0.a;
        String k = gpt0.k(context, videoFile);
        boolean h = h(videoFile);
        ArrayList o = e43.o(new eqs0.b(d, e));
        if (h) {
            o.add(new eqs0.c(videoFile.S3()));
        } else if (!videoFile.q0()) {
            o.addAll(e43.l(new eqs0.c(g), new eqs0.c(k)));
        }
        if (fqs0Var != null && (a = a(fqs0Var, o)) != 0) {
            o = a;
        }
        return new zps0(string, o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final CharSequence d(Context context, VideoFile videoFile) {
        if ((videoFile instanceof MusicVideoFile) && !((Boolean) this.c.getValue()).booleanValue()) {
            return this.b.c(context, (MusicVideoFile) videoFile);
        }
        String P = videoFile.P();
        return P == null ? "" : P;
    }

    public final CharSequence g(Context context, VideoFile videoFile) {
        if (videoFile.L8() == 0) {
            return "";
        }
        boolean z = this.a;
        com.vk.core.utils.b bVar = this.b;
        return z ? bVar.a(context, videoFile) : bVar.b(context, videoFile);
    }

    public cqs0(ift0 ift0Var, int i) {
        boolean z = (i & 1) == 0;
        ift0Var = (i & 2) != 0 ? new ift0() : ift0Var;
        this.a = z;
        this.b = ift0Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new e1m0(9));
    }
}
