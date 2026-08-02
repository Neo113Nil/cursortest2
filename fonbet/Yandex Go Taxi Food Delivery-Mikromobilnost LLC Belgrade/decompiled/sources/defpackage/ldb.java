package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.internal.avatar.a;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.impl.b;

/* loaded from: classes15.dex */
public final class ldb extends x3 {
    public final Context A;
    public final View B;
    public final rh21 C;
    public final View D;
    public UrlPreviewBackgroundStyle E;
    public l8x F;
    public final View c;
    public final jcz0 w;
    public final a x;
    public final kse y;
    public final sh21 z;

    public ldb(jh21 jh21Var, View view, jcz0 jcz0Var, a aVar, kse kseVar, sh21 sh21Var) {
        super(17, jh21Var);
        this.c = view;
        this.w = jcz0Var;
        this.x = aVar;
        this.y = kseVar;
        this.z = sh21Var;
        this.A = view.getContext();
        View a = new iv31(e9h0.chat_url_preview_container_stub, e9h0.chat_url_preview_container, olh0.msg_v_url_preview_chat, view).a();
        this.B = a;
        ImageView imageView = (ImageView) a.findViewById(e9h0.chat_avatar);
        TextView textView = (TextView) a.findViewById(e9h0.chat_preview_info);
        TextView textView2 = (TextView) a.findViewById(e9h0.chat_preview_title);
        TextView textView3 = (TextView) a.findViewById(e9h0.chat_preview_description);
        Button button = (Button) a.findViewById(e9h0.chat_preview_navigation_button);
        this.C = new rh21(imageView, textView, textView2, textView3, button);
        this.D = a.findViewById(e9h0.chat_url_preview_message_status);
        this.E = UrlPreviewBackgroundStyle.LowHalfCorners;
        view.requestLayout();
        button.setOnLongClickListener(new ly4(3, this));
    }

    @Override // defpackage.x3
    public final void Dg() {
        this.B.setVisibility(8);
        l8x l8xVar = this.F;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.F = null;
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.D;
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.B;
    }

    @Override // defpackage.x3
    public final void Rg() {
        Dg();
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.E = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.c;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.E.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.B;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    @Override // defpackage.x3
    public final void show() {
        z83.i();
        this.B.setVisibility(0);
        od9 od9Var = new od9(19, this);
        mdh mdhVar = this.y.d;
        jh21 jh21Var = (jh21) ((ye0) this.b);
        String str = jh21Var.b;
        String str2 = jh21Var.w;
        String str3 = jh21Var.x;
        String str4 = jh21Var.y;
        Integer num = jh21Var.z;
        boolean b = ChatNamespaces.b(str);
        Context context = this.A;
        a aVar = this.x;
        this.F = (b ? new com.yandex.messaging.internal.urlpreview.impl.a(context, aVar, mdhVar, str, str2, str3, str4, num, od9Var) : new b(context, aVar, mdhVar, str, str2, str3, str4, num, od9Var)).a(this.C);
    }
}
