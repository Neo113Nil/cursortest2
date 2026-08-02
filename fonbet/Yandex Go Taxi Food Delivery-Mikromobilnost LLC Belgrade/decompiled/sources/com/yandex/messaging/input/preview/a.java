package com.yandex.messaging.input.preview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.navigation.c;
import defpackage.ak80;
import defpackage.bu0;
import defpackage.e9h0;
import defpackage.h3y;
import defpackage.iv31;
import defpackage.j1w;
import defpackage.kb90;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.zgv;

/* loaded from: classes15.dex */
public final class a {
    public final c a;
    public final com.yandex.messaging.internal.urlpreview.a b;
    public final kb90 c;
    public final bu0 d;
    public boolean e;
    public String f;
    public pzt0 g;

    public a(j1w j1wVar, h3y h3yVar, c cVar, com.yandex.messaging.internal.urlpreview.a aVar, kb90 kb90Var) {
        this.a = cVar;
        this.b = aVar;
        this.c = kb90Var;
        View view = j1wVar.b;
        ak80 ak80Var = new ak80(8, this);
        bu0 bu0Var = new bu0();
        bu0Var.a = h3yVar;
        bu0Var.b = ak80Var;
        bu0Var.c = kotlin.a.a(new ak80(7, bu0Var));
        int i = e9h0.chat_preview_attach_container;
        View a = new iv31(view, i, i).a();
        bu0Var.d = a;
        bu0Var.e = (TextView) a.findViewById(e9h0.chat_input_panel_first_line);
        bu0Var.f = (TextView) a.findViewById(e9h0.chat_input_panel_second_line);
        View findViewById = a.findViewById(e9h0.chat_input_clear);
        bu0Var.g = findViewById;
        bu0Var.h = a.findViewById(e9h0.chat_input_panel_image_preview_container);
        bu0Var.i = (ImageView) a.findViewById(e9h0.chat_input_panel_image_preview);
        a.setVisibility(8);
        findViewById.setOnClickListener(new zgv(26, bu0Var));
        this.d = bu0Var;
        this.e = true;
        this.f = "";
    }

    public final void a() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = null;
        if (!this.e) {
            ((View) this.d.d).setVisibility(8);
        } else {
            this.g = tje.N(this.a, null, null, new PanelUrlPreviewController$onStateChanged$1(this, null), 3);
        }
    }
}
