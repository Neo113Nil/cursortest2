package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.utils.b;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.TitleAction;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.kjt;
import xsna.us2;
import xsna.x8s;

/* compiled from: AboutVideoDescriptionDelegate.kt */
/* loaded from: classes7.dex */
public final class k6 extends p1u0<AboutVideoItem.i> {
    public static final Regex c = new Regex("(?:(\\d+):)?([0-5]?\\d):([0-5]?\\d)(?![:\\d])");
    public final c4 a;
    public final lzn b;

    /* compiled from: AboutVideoDescriptionDelegate.kt */
    public final class a extends vfz<AboutVideoItem.i> {
        public final ift0 l;
        public final wh50 m;

        public a(ViewGroup viewGroup) {
            super(new ComposeView(viewGroup.getContext(), null, 6));
            ComposeView composeView = (ComposeView) this.itemView;
            this.l = new ift0();
            this.m = androidx.compose.runtime.k.b(null);
            composeView.setContent(new jai(-391338179, new d6(0, this, k6.this), true));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(AboutVideoItem.i iVar) {
            String q;
            SpannableString spannableString;
            CharSequence a;
            SpannedString spannedString;
            SpannableStringBuilder spannableStringBuilder;
            String obj;
            kjt.a aVar;
            int i;
            TitleAction.Snippet snippet;
            String str;
            AboutVideoItem.i iVar2 = iVar;
            ListBuilder e = e43.e();
            boolean z = iVar2.h;
            long j = iVar2.c;
            CharSequence charSequence = iVar2.g;
            int i2 = iVar2.e;
            if (!z || i2 > 0) {
                gpt0 gpt0Var = gpt0.a;
                Context context = this.itemView.getContext();
                DecimalFormat decimalFormat = z8s.a;
                e.add(z8s.e(i2, context));
            }
            long j2 = iVar2.d;
            long j3 = 0;
            if (j2 == 0 && j == 0) {
                q = null;
            } else if (j == j2 || j == 0) {
                gpt0 gpt0Var2 = gpt0.a;
                q = gpt0.q((int) (j2 / 1000));
            } else {
                DecimalFormat decimalFormat2 = z8s.a;
                q = z8s.c(this.itemView.getContext(), j, x8s.a.g, true);
            }
            e.add(q);
            Context context2 = this.itemView.getContext();
            TitleAction titleAction = iVar2.i;
            this.l.getClass();
            if (titleAction != null && (snippet = titleAction.e) != null && (str = snippet.b) != null) {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    spannableString = b.C0795b.f(titleAction, context2, str2, 0, str2.length(), null);
                    e.add(spannableString);
                    if (iVar2.j != null) {
                        e.add(this.itemView.getContext().getResources().getString(R.string.video_author_ads));
                    }
                    DonutVideoUiModel donutVideoUiModel = iVar2.k;
                    a = donutVideoUiModel != null ? k6.this.b.a(donutVideoUiModel, this.itemView.getContext()) : null;
                    if (a != null) {
                        e.add(a);
                    }
                    ListBuilder g = e.g();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    int i3 = 0;
                    int i4 = 0;
                    for (Object obj2 : j5g.V(g)) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        CharSequence charSequence2 = (CharSequence) obj2;
                        if (i4 > 0) {
                            spannableStringBuilder2.append((CharSequence) " · ");
                        }
                        spannableStringBuilder2.append(charSequence2);
                        i4 = i5;
                    }
                    spannedString = new SpannedString(spannableStringBuilder2);
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedString);
                    if (!drm0.N(spannedString) && !drm0.N(charSequence)) {
                        spannableStringBuilder.append((CharSequence) " · ");
                    }
                    spannableStringBuilder.append(charSequence);
                    SpannedString spannedString2 = new SpannedString(spannableStringBuilder);
                    int i6 = iVar2.f;
                    Regex regex = k6.c;
                    long c = f870.c(e3m.f(R.attr.vk_ui_text_link, this.itemView.getContext()));
                    us2.b bVar = new us2.b();
                    obj = spannedString2.toString();
                    aVar = new kjt.a(Regex.d(regex, obj));
                    i = 0;
                    while (aVar.hasNext()) {
                        zk10 zk10Var = (zk10) aVar.next();
                        if (zk10Var.c().b > i) {
                            bVar.g(obj.substring(i, zk10Var.c().b));
                        }
                        String value = zk10Var.getValue();
                        List c0 = drm0.c0(value, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, i3, 6);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c0.iterator();
                        while (it.hasNext()) {
                            Long n = arm0.n((String) it.next());
                            if (n != null) {
                                arrayList.add(n);
                            }
                        }
                        List y0 = j5g.y0(arrayList);
                        Long l = (Long) j5g.b0(i3, y0);
                        long longValue = l != null ? l.longValue() : j3;
                        Long l2 = (Long) j5g.b0(1, y0);
                        long longValue2 = l2 != null ? l2.longValue() : j3;
                        Long l3 = (Long) j5g.b0(2, y0);
                        long longValue3 = l3 != null ? l3.longValue() : j3;
                        long j4 = j3;
                        long j5 = 60;
                        long j6 = (longValue3 * j5 * j5) + (longValue2 * j5) + longValue;
                        if (j4 > j6 || j6 >= i6) {
                            bVar.g(value);
                        } else {
                            bVar.m(new hik0(c, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.g(value);
                            bVar.j();
                        }
                        i = zk10Var.c().c + 1;
                        j3 = j4;
                        i3 = 0;
                    }
                    if (i < obj.length()) {
                        bVar.g(obj.substring(i));
                    }
                    ((zak0) this.m).setValue(new o2m(iVar2.b.toString(), bVar.n()));
                }
            }
            spannableString = null;
            e.add(spannableString);
            if (iVar2.j != null) {
            }
            DonutVideoUiModel donutVideoUiModel2 = iVar2.k;
            a = donutVideoUiModel2 != null ? k6.this.b.a(donutVideoUiModel2, this.itemView.getContext()) : null;
            if (a != null) {
            }
            ListBuilder g2 = e.g();
            SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
            int i32 = 0;
            int i42 = 0;
            while (r2.hasNext()) {
            }
            spannedString = new SpannedString(spannableStringBuilder22);
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannedString);
            if (!drm0.N(spannedString)) {
                spannableStringBuilder.append((CharSequence) " · ");
            }
            spannableStringBuilder.append(charSequence);
            SpannedString spannedString22 = new SpannedString(spannableStringBuilder);
            int i62 = iVar2.f;
            Regex regex2 = k6.c;
            long c2 = f870.c(e3m.f(R.attr.vk_ui_text_link, this.itemView.getContext()));
            us2.b bVar2 = new us2.b();
            obj = spannedString22.toString();
            aVar = new kjt.a(Regex.d(regex2, obj));
            i = 0;
            while (aVar.hasNext()) {
            }
            if (i < obj.length()) {
            }
            ((zak0) this.m).setValue(new o2m(iVar2.b.toString(), bVar2.n()));
        }
    }

    public k6(c4 c4Var, lzn lznVar) {
        this.a = c4Var;
        this.b = lznVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.i> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.i;
    }
}
