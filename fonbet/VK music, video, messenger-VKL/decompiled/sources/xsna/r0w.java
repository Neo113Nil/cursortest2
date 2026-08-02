package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.components.dialogs_header.vc.HeaderInfo;
import com.vk.im.ui.views.MentionCounterView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: ImDialogsHeaderComponent.kt */
/* loaded from: classes2.dex */
public final class r0w extends j8i {
    public final a1w i;
    public final mxv j;
    public final b25 k;
    public xqm l;
    public s0w m;
    public yqm n;

    /* compiled from: ImDialogsHeaderComponent.kt */
    public final class a {
        public a() {
        }
    }

    public r0w(a1w a1wVar, mxv mxvVar, b25 b25Var) {
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    @Override // xsna.j8i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        int i;
        Integer num;
        Drawable drawable;
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup2;
        View view4;
        Toolbar toolbar;
        Toolbar toolbar2;
        Toolbar toolbar3;
        View view5;
        if (o25.b(this.k)) {
            num = Integer.valueOf(R.drawable.vk_icon_logo_sferum_color_16);
            i = R.string.vkim_edu_dialogs_title;
        } else {
            i = R.string.vkim_dialogs_header_title_rename;
            num = null;
        }
        a1w a1wVar = this.i;
        cau0 cau0Var = a1wVar.r().h;
        s0w s0wVar = new s0w(i, false, num);
        this.m = s0wVar;
        s0wVar.b = new a();
        if (viewStub == null) {
            throw new IllegalStateException("viewStub cannot be null");
        }
        viewStub.setLayoutResource(R.layout.vkim_dialogs_header);
        View inflate = viewStub.inflate();
        s0wVar.c = inflate;
        Context context = inflate.getContext();
        if (num != null) {
            int intValue = num.intValue();
            e3m.a aVar = e3m.a;
            drawable = m33.a(intValue, context);
            if (drawable != null) {
                int i2 = s0w.m;
                drawable.setBounds(0, 0, i2, i2);
                s0wVar.l = drawable;
                view = s0wVar.c;
                if (view == null) {
                    view = null;
                }
                TextView textView = (TextView) view.findViewById(R.id.vkim_toolbar_title);
                s0wVar.d = textView;
                textView.setCompoundDrawablePadding(s0w.n);
                view2 = s0wVar.c;
                if (view2 == null) {
                    view2 = null;
                }
                s0wVar.e = (Toolbar) view2.findViewById(R.id.toolbar);
                view3 = s0wVar.c;
                if (view3 == null) {
                    view3 = null;
                }
                ViewGroup viewGroup3 = (ViewGroup) view3.findViewById(R.id.vkim_archive_group);
                s0wVar.f = viewGroup3;
                viewGroup3.setVisibility(8);
                viewGroup2 = s0wVar.f;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                jjc.g(viewGroup2, new b5h(s0wVar, 21));
                view4 = s0wVar.c;
                if (view4 == null) {
                    view4 = null;
                }
                MentionCounterView mentionCounterView = (MentionCounterView) view4.findViewById(R.id.vkim_archive_counter);
                s0wVar.g = mentionCounterView;
                mentionCounterView.setMuted(true);
                toolbar = s0wVar.e;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.l(R.menu.vkim_dialogs_list_header_new);
                toolbar2 = s0wVar.e;
                if (toolbar2 == null) {
                    toolbar2 = null;
                }
                toolbar2.setNavigationOnClickListener(new mn9(s0wVar, 5));
                toolbar3 = s0wVar.e;
                if (toolbar3 == null) {
                    toolbar3 = null;
                }
                toolbar3.setOnMenuItemClickListener(new y7(s0wVar, 25));
                s0wVar.h = true;
                s0wVar.c(HeaderInfo.CONNECTING);
                view5 = s0wVar.c;
                if (view5 == null) {
                    view5 = null;
                }
                s0w s0wVar2 = this.m;
                yqm yqmVar = new yqm(a1wVar, this, s0wVar2 != null ? s0wVar2 : null);
                this.n = yqmVar;
                ImBgSyncState a2 = a1wVar.p().a(LongPollType.MESSAGES);
                yqmVar.e = a2;
                yqmVar.f.a(com.vk.im.engine.reporters.syncstate.b.a(a2));
                yqmVar.a();
                return view5;
            }
        }
        drawable = null;
        s0wVar.l = drawable;
        view = s0wVar.c;
        if (view == null) {
        }
        TextView textView2 = (TextView) view.findViewById(R.id.vkim_toolbar_title);
        s0wVar.d = textView2;
        textView2.setCompoundDrawablePadding(s0w.n);
        view2 = s0wVar.c;
        if (view2 == null) {
        }
        s0wVar.e = (Toolbar) view2.findViewById(R.id.toolbar);
        view3 = s0wVar.c;
        if (view3 == null) {
        }
        ViewGroup viewGroup32 = (ViewGroup) view3.findViewById(R.id.vkim_archive_group);
        s0wVar.f = viewGroup32;
        viewGroup32.setVisibility(8);
        viewGroup2 = s0wVar.f;
        if (viewGroup2 == null) {
        }
        jjc.g(viewGroup2, new b5h(s0wVar, 21));
        view4 = s0wVar.c;
        if (view4 == null) {
        }
        MentionCounterView mentionCounterView2 = (MentionCounterView) view4.findViewById(R.id.vkim_archive_counter);
        s0wVar.g = mentionCounterView2;
        mentionCounterView2.setMuted(true);
        toolbar = s0wVar.e;
        if (toolbar == null) {
        }
        toolbar.l(R.menu.vkim_dialogs_list_header_new);
        toolbar2 = s0wVar.e;
        if (toolbar2 == null) {
        }
        toolbar2.setNavigationOnClickListener(new mn9(s0wVar, 5));
        toolbar3 = s0wVar.e;
        if (toolbar3 == null) {
        }
        toolbar3.setOnMenuItemClickListener(new y7(s0wVar, 25));
        s0wVar.h = true;
        s0wVar.c(HeaderInfo.CONNECTING);
        view5 = s0wVar.c;
        if (view5 == null) {
        }
        s0w s0wVar22 = this.m;
        yqm yqmVar2 = new yqm(a1wVar, this, s0wVar22 != null ? s0wVar22 : null);
        this.n = yqmVar2;
        ImBgSyncState a22 = a1wVar.p().a(LongPollType.MESSAGES);
        yqmVar2.e = a22;
        yqmVar2.f.a(com.vk.im.engine.reporters.syncstate.b.a(a22));
        yqmVar2.a();
        return view5;
    }

    @Override // xsna.j8i
    public final void N0() {
        s0w s0wVar = this.m;
        if (s0wVar == null) {
            s0wVar = null;
        }
        s0wVar.k.removeCallbacksAndMessages(null);
        s0w s0wVar2 = this.m;
        if (s0wVar2 == null) {
            s0wVar2 = null;
        }
        s0wVar2.b = null;
    }

    public final void X0() {
        yqm yqmVar = this.n;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.b();
    }

    public final void Y0(xqm xqmVar) {
        this.l = xqmVar;
    }

    public final void Z0(DialogsFilter dialogsFilter) {
        yqm yqmVar = this.n;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.c.b(dialogsFilter);
    }
}
