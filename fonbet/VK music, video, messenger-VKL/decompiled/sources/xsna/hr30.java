package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ir30;
import xsna.kq4;

/* compiled from: MsgPartHolderBase.kt */
/* loaded from: classes2.dex */
public abstract class hr30<A extends Attach, B extends ir30> implements kq4.a {
    public static final StringBuilder b = new StringBuilder();
    public static final t040 c = t040.a;

    /* compiled from: MsgPartHolderBase.kt */
    public static final class a {
        public static void a(TimeAndStatusView timeAndStatusView, jr30 jr30Var, boolean z) {
            timeAndStatusView.setGradientBubble(jr30Var.g);
            b(timeAndStatusView, jr30Var, z);
        }

        public static void b(TimeAndStatusView timeAndStatusView, jr30 jr30Var, boolean z) {
            boolean z2 = jr30Var.a;
            Pair<String, Integer> pair = jr30Var.p;
            if (!z2 && !jr30Var.b) {
                timeAndStatusView.setVisibility(8);
                return;
            }
            StringBuilder sb = hr30.b;
            sb.setLength(0);
            t040 t040Var = hr30.c;
            long j = jr30Var.j;
            boolean z3 = jr30Var.h;
            Context context = timeAndStatusView.getContext();
            boolean z4 = jr30Var.c;
            t040Var.getClass();
            t040.a(j, z3, context, sb, z4);
            timeAndStatusView.setDarkBackground(z);
            timeAndStatusView.b(new TimeAndStatusView.a(jr30Var.a, jr30Var.b, jr30Var.c, jr30Var.d, jr30Var.e, jr30Var.f, jr30Var.g, jr30Var.h, jr30Var.i, jr30Var.j, jr30Var.k, jr30Var.l, jr30Var.m, jr30Var.n, jr30Var.o), pair);
            timeAndStatusView.setVisibility(0);
            if (pair == null || !z) {
                return;
            }
            Integer j2 = pair.j();
            timeAndStatusView.setTimeTextColor(j2 != null ? j2.intValue() : -1);
        }
    }

    public static void j(MsgPartIconTwoRowView msgPartIconTwoRowView, BubbleColors bubbleColors) {
        msgPartIconTwoRowView.setTitleTextColor(bubbleColors.d);
        msgPartIconTwoRowView.setSubtitleTextColor(bubbleColors.i);
        msgPartIconTwoRowView.setTimeTextColor(bubbleColors.h);
        msgPartIconTwoRowView.setIconTintColor(bubbleColors.c);
    }

    public static void k(MsgPartSnippetView msgPartSnippetView, BubbleColors bubbleColors) {
        msgPartSnippetView.setButtonTextColor(bubbleColors.c);
        int i = bubbleColors.i;
        msgPartSnippetView.setCaptionTextColor(i);
        msgPartSnippetView.setDescriptionTextColor(i);
        msgPartSnippetView.setTitleTextColor(bubbleColors.d);
        msgPartSnippetView.setTimeTextColor(bubbleColors.h);
        msgPartSnippetView.setPriceTextColor(bubbleColors.g);
        msgPartSnippetView.setOldPriceTextColor(i);
    }

    public static void l(TimeAndStatusView timeAndStatusView, jr30 jr30Var, boolean z) {
        timeAndStatusView.setGradientBubble(jr30Var.g);
        a.b(timeAndStatusView, jr30Var, z);
    }

    public static void m(jr30 jr30Var, hux0 hux0Var) {
        l(hux0Var.getTimeAndStatusView(), jr30Var, false);
        hux0Var.X3();
    }

    public View n(int i) {
        return null;
    }

    public abstract void p(B b2, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var);

    public abstract View q(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    public void r() {
    }

    @Override // xsna.kq4.a
    public void a(AudioTrack audioTrack) {
    }

    @Override // xsna.kq4.a
    public void i(hr4 hr4Var) {
    }

    public void o(BubbleColors bubbleColors) {
    }
}
