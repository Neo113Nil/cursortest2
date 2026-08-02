package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.voip.dto.profiles.VoipSex;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.di8;

/* compiled from: BroadcastPreviewSimpleView.kt */
/* loaded from: classes7.dex */
public final class bi8 {
    public final l7s a;

    @SuppressLint({"InflateParams"})
    public final ViewGroup b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final AppCompatImageView f;
    public final AppCompatImageView g;
    public final View h;
    public final bzb0 i;
    public final io.reactivex.rxjava3.subjects.f<ci8> j;
    public di8 k;
    public io.reactivex.rxjava3.disposables.c l;
    public boolean m;
    public boolean n;

    /* compiled from: BroadcastPreviewSimpleView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipSex.values().length];
            try {
                iArr[VoipSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bi8(l7s l7sVar) {
        this.a = l7sVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(l7sVar).inflate(R.layout.voip_broadcast_preview_simple, (ViewGroup) null, false);
        this.b = viewGroup;
        this.c = (TextView) viewGroup.findViewById(R.id.tv_broadcast_initiator_description);
        this.d = (TextView) viewGroup.findViewById(R.id.tv_broadcast_preview_counter_text);
        this.e = viewGroup.findViewById(R.id.divider);
        this.f = (AppCompatImageView) viewGroup.findViewById(R.id.iv_broadcast_icon);
        this.g = (AppCompatImageView) viewGroup.findViewById(R.id.iv_record_icon);
        View findViewById = viewGroup.findViewById(R.id.finish);
        this.h = findViewById;
        this.i = new bzb0(l7sVar);
        this.j = new io.reactivex.rxjava3.subjects.f<>();
        this.m = true;
        this.n = true;
        viewGroup.setOnClickListener(new o44(0));
        bwt0.i0(findViewById, new w5(this, 10));
        b(di8.b.a);
    }

    public final void a(di8.a aVar) {
        long j = aVar.b;
        xuo0.a.getClass();
        long f = uzp.f(xuo0.a(), j);
        TextView textView = this.d;
        Context context = textView.getContext();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(f);
        if (!aVar.c) {
            boolean z = f >= 0;
            bwt0.p0(this.e, z);
            bwt0.p0(this.c, z);
            AppCompatImageView appCompatImageView = this.f;
            if (z) {
                appCompatImageView.setImageResource(R.drawable.vk_icon_live_badge_16);
            } else {
                dhr0.f0(R.drawable.vk_icon_live_badge_color_16, R.attr.vk_ui_icon_secondary, appCompatImageView);
            }
        }
        boolean z2 = seconds < 0 || seconds >= 5;
        bwt0.p0(textView, z2);
        if (z2) {
            textView.setText(uzp.g(context, f, true));
        }
    }

    public final void b(di8 di8Var) {
        Object string;
        if (!this.n) {
            mk5 mk5Var = new mk5();
            mk5Var.g(0);
            zmp0.a(this.b, mk5Var);
        }
        boolean z = di8Var instanceof di8.a;
        View view = this.h;
        AppCompatImageView appCompatImageView = this.g;
        AppCompatImageView appCompatImageView2 = this.f;
        if (z) {
            di8.a aVar = (di8.a) di8Var;
            boolean z2 = aVar.c;
            boolean z3 = aVar.d;
            bwt0.p0(appCompatImageView2, !z2);
            bwt0.p0(appCompatImageView, z2);
            bwt0.p0(view, z3);
            qvw0 qvw0Var = aVar.a;
            boolean z4 = aVar.c;
            VoipSex b = qvw0Var != null ? qvw0Var.b() : null;
            int i = b == null ? -1 : a.$EnumSwitchMapping$0[b.ordinal()];
            int i2 = R.string.voip_broadcast_ongoing_by_female;
            if (i != 1 ? z4 : z4) {
                i2 = R.string.voip_broadcast_record_ongoing_by_female;
            }
            l7s l7sVar = this.a;
            if (qvw0Var == null || (string = f370.s(qvw0Var)) == null) {
                string = l7sVar.getString(R.string.voip_broadcast_owner_unknown);
            }
            this.c.setText(l7sVar.getString(i2, string));
        } else {
            bwt0.p0(appCompatImageView2, false);
            bwt0.p0(appCompatImageView, false);
            bwt0.p0(view, false);
        }
        if (z) {
            a((di8.a) di8Var);
            this.l = io.reactivex.rxjava3.core.q.Q(500L, 500L, TimeUnit.MILLISECONDS, asu0.a.d()).subscribe(new b00(new k9(this, 16), 5));
        } else {
            io.reactivex.rxjava3.disposables.c cVar = this.l;
            if (cVar != null) {
                cVar.dispose();
            }
            this.l = null;
        }
    }
}
