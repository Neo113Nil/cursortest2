package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.s1c0;

/* compiled from: PollPopupV2View.kt */
/* loaded from: classes4.dex */
public final class crb0 extends LinearLayout implements View.OnClickListener {
    public final View b;
    public View.OnClickListener c;

    /* compiled from: PollPopupV2View.kt */
    public static final class a extends dw20.b {
        public final lad0 e;
        public final u1c0 f;

        public a(Context context, lad0 lad0Var, u1c0 u1c0Var) {
            super(context, null);
            this.e = lad0Var;
            this.f = u1c0Var;
        }
    }

    public crb0(Context context, lad0 lad0Var, u1c0 u1c0Var) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.poll_popup_layout_v2, (ViewGroup) this, true);
        setOrientation(1);
        View findViewById = findViewById(R.id.poll_modal_close);
        this.b = findViewById;
        findViewById.setOnClickListener(this);
        ((PrimaryAttachmentPollV2View) findViewById(R.id.poll_view)).setMode(PrimaryAttachmentPollV2View.Mode.UNSPECIFIED);
        pr0 pr0Var = new pr0(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        msy.a(lazyThreadSafetyMode, pr0Var);
        msy.a(lazyThreadSafetyMode, new x0(12));
        b7d0 b7d0Var = new b7d0(this, (tvb0) msy.a(lazyThreadSafetyMode, new uz(12)).getValue(), this);
        if (lad0Var != null) {
            u1c0 c = lbs.c(u1c0Var, null, null, 0, 7);
            s1c0.a aVar = new s1c0.a();
            aVar.k = true;
            c.n = aVar.a();
            c.h = lad0Var;
            b7d0Var.a6(c);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        if (jjc.b() || (onClickListener = this.c) == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }
}
