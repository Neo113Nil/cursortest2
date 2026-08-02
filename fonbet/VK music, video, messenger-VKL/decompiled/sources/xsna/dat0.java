package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoQualityBottomSheet.kt */
/* loaded from: classes2.dex */
public final class dat0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final int g;
    public final List<Integer> h;
    public final LinkedHashMap i;

    /* compiled from: VideoQualityBottomSheet.kt */
    public static final class a {
        public final String a;
        public final boolean b;
        public final cat0 c;

        public a(String str, boolean z, cat0 cat0Var) {
            this.a = str;
            this.b = z;
            this.c = cat0Var;
        }
    }

    public dat0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, dz20 dz20Var, int i, List list, LinkedHashMap linkedHashMap) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = dz20Var;
        this.g = i;
        this.h = list;
        this.i = linkedHashMap;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        LinkedHashMap linkedHashMap;
        Activity activity;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.h.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z = true;
            linkedHashMap = this.i;
            activity = this.c;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            gpt0 gpt0Var = gpt0.a;
            if (intValue == -5 || intValue == -4 || intValue != -3) {
            }
            String obj = gpt0.t(activity, intValue, linkedHashMap).toString();
            if (intValue != this.g) {
                z = false;
            }
            arrayList.add(new a(obj, z, new cat0(this.d, intValue)));
        }
        av20.a aVar = new av20.a();
        dhr0.a.getClass();
        int i = dhr0.u().c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar.d = new eat0();
        aVar.c(new u0r(this, 5));
        av20 b = aVar.b();
        b.setItems(arrayList);
        dw20.b bVar = new dw20.b(activity, null);
        bVar.a0(new yei0(this, 22));
        bVar.d0(new mwm0(this, 14));
        dw20.a.k(bVar, b, 4);
        if (!linkedHashMap.isEmpty()) {
            Context context = bVar.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) context.getString(R.string.video_quality_neuro_title));
            spannableStringBuilder.append((CharSequence) "\n");
            FontFamily fontFamily = FontFamily.MEDIUM;
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            nik0.a(spannableStringBuilder, a.C1933a.a(context, fontFamily, 13.0f, textSizeUnit).a, 0, spannableStringBuilder.length());
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder.length() - 1, 33);
            rik0.b(iah0.b(2.0f));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) context.getString(R.string.video_quality_neuro_subtitle));
            nik0.a(spannableStringBuilder, a.C1933a.a(context, FontFamily.REGULAR, 13.0f, textSizeUnit).a, length, spannableStringBuilder.length());
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), length + 1, spannableStringBuilder.length(), 33);
            nik0.c(spannableStringBuilder, context.getColor(R.color.vk_gray_400), 0, spannableStringBuilder.length());
            spannableStringBuilder.append((CharSequence) "\n");
            rik0.b(iah0.b(6.0f));
            bVar.s0(spannableStringBuilder);
        }
        bVar.f0(new r0r0(this, 10));
        return bVar.I0("video_quality");
    }
}
