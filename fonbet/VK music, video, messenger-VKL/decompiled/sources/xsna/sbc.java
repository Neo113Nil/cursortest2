package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.im.ui.components.dialogs_list.ChooseMode;
import com.vkontakte.android.R;

/* compiled from: ChooserDialogsHeaderComponent.kt */
/* loaded from: classes2.dex */
public final class sbc extends j8i {
    public final a1w i;
    public final mxv j;
    public final ChooseMode k;
    public xqm l;
    public tbc m;
    public yqm n;

    /* compiled from: ChooserDialogsHeaderComponent.kt */
    public final class a {
        public a() {
        }
    }

    public sbc(a1w a1wVar, mxv mxvVar, ChooseMode chooseMode) {
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = chooseMode;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ChooseMode chooseMode = this.k;
        tbc tbcVar = new tbc(chooseMode);
        this.m = tbcVar;
        tbcVar.a = new a();
        if (viewStub == null) {
            throw new IllegalStateException("viewStub cannot be null");
        }
        viewStub.setLayoutResource(R.layout.vkim_dialogs_header_for_chooser);
        View inflate = viewStub.inflate();
        tbcVar.b = inflate;
        tbcVar.c = inflate.getContext();
        View view = tbcVar.b;
        if (view == null) {
            view = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.vkim_toolbar_title);
        Context context = tbcVar.c;
        if (context == null) {
            context = null;
        }
        textView.setText(context.getString(chooseMode.b));
        View view2 = tbcVar.b;
        if (view2 == null) {
            view2 = null;
        }
        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
        tbcVar.d = toolbar;
        toolbar.l(R.menu.vkim_dialogs_list_header_chooser);
        Toolbar toolbar2 = tbcVar.d;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new mn9(tbcVar, 1));
        Toolbar toolbar3 = tbcVar.d;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setOnMenuItemClickListener(new y7(tbcVar, 7));
        View view3 = tbcVar.b;
        if (view3 == null) {
            view3 = null;
        }
        tbc tbcVar2 = this.m;
        this.n = new yqm(this.i, this, tbcVar2 != null ? tbcVar2 : null);
        return view3;
    }

    @Override // xsna.j8i
    public final void M0() {
        yqm yqmVar = this.n;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.f.shutdown();
    }

    @Override // xsna.j8i
    public final void N0() {
        yqm yqmVar = this.n;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.getClass();
        tbc tbcVar = this.m;
        if (tbcVar == null) {
            tbcVar = null;
        }
        tbcVar.e.removeCallbacksAndMessages(null);
        tbc tbcVar2 = this.m;
        if (tbcVar2 == null) {
            tbcVar2 = null;
        }
        tbcVar2.a = null;
    }
}
