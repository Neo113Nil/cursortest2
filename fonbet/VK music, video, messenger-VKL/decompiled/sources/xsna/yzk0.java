package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import androidx.compose.ui.platform.ComposeView;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vkontakte.android.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.us2;

/* compiled from: StatusPopupBottomSheet.kt */
/* loaded from: classes4.dex */
public final class yzk0 extends jmu0 {
    public final ComposeView h1;
    public ActionOpenModal i1;
    public us2 j1;
    public final a0l0 k1 = new a0l0();

    /* compiled from: StatusPopupBottomSheet.kt */
    public static final class a extends kmu0 {
        public static final int i = cn70.b(8);
        public final ActionOpenModal h;

        public a(Context context, ActionOpenModal actionOpenModal) {
            super(context, tzp0.a(null, 3));
            this.h = actionOpenModal;
            I(true);
            x(0);
            u(0);
            int i2 = i;
            p0(i2);
            m0(i2);
            n0(i2);
            o0(i2);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            yzk0 yzk0Var = new yzk0(S0());
            yzk0Var.setArguments(yfb.b(new Pair("ARG_ACTION_OPEN_MODAL", this.h)));
            return yzk0Var;
        }
    }

    /* compiled from: StatusPopupBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((yzk0) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public yzk0(ComposeView composeView) {
        this.h1 = composeView;
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1766507437);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1766507437, 8, -1, "com.vk.newsfeed.common.popups.status.StatusPopupBottomSheet.ThemedContent (StatusPopupBottomSheet.kt:48)");
        }
        rrv0.a(null, null, kai.c(658229333, new vp4(this, 8), aVar), aVar, 24576, 15);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ActionOpenModal actionOpenModal;
        String str;
        m7s m7sVar;
        Integer valueOf;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        us2 us2Var = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("ARG_ACTION_OPEN_MODAL", ActionOpenModal.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("ARG_ACTION_OPEN_MODAL");
                if (!(parcelable3 instanceof ActionOpenModal)) {
                    parcelable3 = null;
                }
                parcelable = (ActionOpenModal) parcelable3;
            }
            actionOpenModal = (ActionOpenModal) parcelable;
        } else {
            actionOpenModal = null;
        }
        if (actionOpenModal == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.i1 = actionOpenModal;
        Text text = actionOpenModal.e;
        if (text != null && (str = text.b) != null) {
            Context requireContext = requireContext();
            a0l0 a0l0Var = this.k1;
            a0l0Var.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Matcher matcher = ((Pattern) a0l0Var.a.getValue()).matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group(2);
                if (group != null) {
                    int start = matcher.start() - i;
                    int end = matcher.end() - i;
                    int length = group.length() + start;
                    int i2 = end - length;
                    spannableStringBuilder = spannableStringBuilder.replace(start, end, (CharSequence) group);
                    String group2 = matcher.group(1);
                    if (group2 != null) {
                        int hashCode = group2.hashCode();
                        if (hashCode == -1423461174) {
                            if (group2.equals("accent")) {
                                valueOf = Integer.valueOf(R.attr.vk_ui_text_accent);
                                if (valueOf != null) {
                                }
                            }
                            Integer l = znk0.l(requireContext, group2);
                            if (l == null) {
                            }
                            if (valueOf != null) {
                            }
                        } else if (hashCode != 340184622) {
                            if (hashCode == 834873091 && group2.equals("dynamic_green")) {
                                valueOf = Integer.valueOf(R.attr.vk_ui_accent_green);
                                if (valueOf != null) {
                                    m7sVar = new m7s(valueOf.intValue());
                                    if (m7sVar != null) {
                                        spannableStringBuilder.setSpan(m7sVar, start, length, 0);
                                    }
                                    i += i2;
                                }
                            }
                            Integer l2 = znk0.l(requireContext, group2);
                            valueOf = l2 == null ? znk0.l(requireContext, "vk_".concat(group2)) : l2;
                            if (valueOf != null) {
                            }
                        } else {
                            if (group2.equals("dynamic_orange")) {
                                valueOf = Integer.valueOf(R.attr.vk_ui_accent_orange);
                                if (valueOf != null) {
                                }
                            }
                            Integer l22 = znk0.l(requireContext, group2);
                            if (l22 == null) {
                            }
                            if (valueOf != null) {
                            }
                        }
                    }
                    m7sVar = null;
                    if (m7sVar != null) {
                    }
                    i += i2;
                }
            }
            us2.b bVar = new us2.b();
            bVar.f(spannableStringBuilder);
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m7s.class)) {
                m7s m7sVar2 = (m7s) obj;
                bVar.d(new hik0(f870.c(m7sVar2.b.a()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spannableStringBuilder.getSpanStart(m7sVar2), spannableStringBuilder.getSpanEnd(m7sVar2));
            }
            us2Var = bVar.n();
        }
        this.j1 = us2Var;
    }
}
