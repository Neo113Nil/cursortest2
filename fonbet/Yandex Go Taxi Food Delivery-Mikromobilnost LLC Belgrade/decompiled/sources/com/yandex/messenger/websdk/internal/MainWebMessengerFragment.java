package com.yandex.messenger.websdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.internal.view.BackHandlingFrameLayout;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;
import defpackage.c1b;
import defpackage.d1b;
import defpackage.ew2;
import defpackage.f8b;
import defpackage.fr31;
import defpackage.gw00;
import defpackage.h9h0;
import defpackage.hc3;
import defpackage.heb;
import defpackage.i3y;
import defpackage.i8b;
import defpackage.j8b;
import defpackage.jl40;
import defpackage.nvy0;
import defpackage.o3;
import defpackage.od8;
import defpackage.p1b;
import defpackage.qh41;
import defpackage.qlh0;
import defpackage.rd00;
import defpackage.rv41;
import defpackage.rya0;
import defpackage.v5s0;
import defpackage.vx21;
import defpackage.w5s0;
import defpackage.ye0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B/\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J)\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/messenger/websdk/internal/MainWebMessengerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lqh41;", "component", "Lcom/yandex/messenger/websdk/api/ChatRequest;", "chatRequest", "", "supportContextJson", "initialText", "(Lqh41;Lcom/yandex/messenger/websdk/api/ChatRequest;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lrd00;", "controller", "Lrd00;", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainWebMessengerFragment extends Fragment {
    private rd00 controller;

    public MainWebMessengerFragment(qh41 qh41Var, ChatRequest chatRequest, String str, String str2) {
        this();
        this.controller = new rd00(this, qh41Var, chatRequest, str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        heb hebVar;
        hc3 hc3Var;
        p1b p1bVar;
        super.onActivityResult(requestCode, resultCode, data);
        rd00 rd00Var = this.controller;
        if (rd00Var == null || (hebVar = rd00Var.F) == null || (hc3Var = hebVar.v) == null || (p1bVar = hc3Var.f) == null || ((ValueCallback) p1bVar.b) == null || requestCode != 9797) {
            return;
        }
        Uri data2 = (resultCode != -1 || data == null) ? null : data.getData();
        ValueCallback valueCallback = (ValueCallback) p1bVar.b;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(data2 != null ? new Uri[]{data2} : new Uri[0]);
        }
        p1bVar.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd00 rd00Var = this.controller;
        if (rd00Var == null) {
            return null;
        }
        BackHandlingFrameLayout backHandlingFrameLayout = (BackHandlingFrameLayout) inflater.inflate(qlh0.msg_fr_websdk, container, false);
        rd00Var.x.getClass();
        View findViewById = backHandlingFrameLayout.findViewById(h9h0.msg_webview_error);
        findViewById.setOnClickListener(new od8(2));
        rd00Var.A = findViewById;
        View findViewById2 = backHandlingFrameLayout.findViewById(h9h0.msg_webview_progress);
        findViewById2.setOnClickListener(new od8(2));
        rd00Var.B = findViewById2;
        rd00Var.C = (TextView) backHandlingFrameLayout.findViewById(h9h0.msg_webview_error_text);
        rd00Var.D = (TextView) backHandlingFrameLayout.findViewById(h9h0.msg_webview_error_btn);
        return backHandlingFrameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        rd00 rd00Var = this.controller;
        if (rd00Var != null) {
            heb hebVar = rd00Var.F;
            if (hebVar != null) {
                d1b d1bVar = rd00Var.c;
                MainWebMessengerFragment mainWebMessengerFragment = rd00Var.a;
                ye0 ye0Var = d1bVar.d;
                c1b c1bVar = ye0Var instanceof c1b ? (c1b) ye0Var : null;
                if (c1bVar == null || !jl40.l(c1bVar.p(), hebVar)) {
                    jl40.x("WebView was changed while being shown");
                    d1bVar.a.b("wm_foreground_only_detaching");
                    hebVar.d();
                    hebVar.c();
                } else {
                    d1bVar.b(c1bVar.e(mainWebMessengerFragment));
                }
            }
            rd00Var.F = null;
            rd00Var.G = null;
            rd00Var.w.b("wm_chat_frame_destroyed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        rd00 rd00Var = this.controller;
        if (rd00Var != null) {
            if (rd00Var.G == null) {
                FragmentActivity requireActivity = rd00Var.a.requireActivity();
                rd00Var.x.getClass();
                i3y i3yVar = vx21.a;
                rd00Var.G = requireActivity;
            }
            Context context = rd00Var.G;
            LayoutInflater from = context != null ? LayoutInflater.from(context) : null;
            if (from != null) {
                return from;
            }
        }
        return super.onGetLayoutInflater(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        heb hebVar;
        fr31 fr31Var;
        super.onPause();
        rd00 rd00Var = this.controller;
        if (rd00Var == null || (hebVar = rd00Var.F) == null || (fr31Var = hebVar.w) == null) {
            return;
        }
        fr31Var.d = false;
        fr31Var.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        heb hebVar;
        hc3 hc3Var;
        o3 o3Var;
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        rd00 rd00Var = this.controller;
        if (rd00Var == null || (hebVar = rd00Var.F) == null || (hc3Var = hebVar.v) == null || (o3Var = hc3Var.d) == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) o3Var.c;
        rya0 rya0Var = (rya0) sparseArray.get(requestCode);
        if (rya0Var == null) {
            return;
        }
        sparseArray.remove(requestCode);
        ArrayList arrayList = new ArrayList(grantResults.length);
        int length = grantResults.length;
        for (int i = 0; i < length; i++) {
            if (grantResults[i] == 0) {
                arrayList.add(permissions[i]);
            }
        }
        rya0Var.a.s(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        heb hebVar;
        fr31 fr31Var;
        super.onResume();
        rd00 rd00Var = this.controller;
        if (rd00Var == null || (hebVar = rd00Var.F) == null || (fr31Var = hebVar.w) == null) {
            return;
        }
        fr31Var.d = true;
        fr31Var.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ChatRequest j8bVar;
        super.onViewCreated(view, savedInstanceState);
        rd00 rd00Var = this.controller;
        if (rd00Var != null) {
            ew2 ew2Var = rd00Var.w;
            MainWebMessengerFragment mainWebMessengerFragment = rd00Var.a;
            Bundle requireArguments = mainWebMessengerFragment.requireArguments();
            String string = requireArguments.getString(i8b.class.getSimpleName());
            if (string != null) {
                j8bVar = new i8b(string);
            } else {
                String string2 = requireArguments.getString(f8b.class.getSimpleName());
                if (string2 != null) {
                    j8bVar = new f8b(string2);
                } else {
                    String string3 = requireArguments.getString(j8b.class.getSimpleName());
                    j8bVar = string3 != null ? new j8b(string3) : null;
                }
            }
            ChatWebViewController$IntentPage chatWebViewController$IntentPage = j8bVar != null ? ChatWebViewController$IntentPage.CHAT : ChatWebViewController$IntentPage.CHAT_LIST;
            rd00Var.b.r.c("wm_chat_start_frame_init", gw00.e(new Pair("intent_page", chatWebViewController$IntentPage.name())));
            nvy0 nvy0Var = (nvy0) rd00Var.z.getValue();
            heb hebVar = rd00Var.F;
            if (hebVar != null) {
                int i = nvy0Var.d;
                rv41 f = hebVar.f();
                if (f != null) {
                    f.F(i);
                }
            }
            View view2 = rd00Var.B;
            if (view2 == null) {
                view2 = null;
            }
            int i2 = nvy0Var.d;
            int i3 = nvy0Var.b;
            view2.setBackgroundColor(i2);
            View view3 = rd00Var.A;
            if (view3 == null) {
                view3 = null;
            }
            view3.setBackgroundColor(i2);
            View requireView = mainWebMessengerFragment.requireView();
            requireView.setBackgroundColor(i2);
            ((TextView) requireView.findViewById(h9h0.msg_webview_error_text)).setTextColor(i3);
            ((TextView) requireView.findViewById(h9h0.msg_webview_error_btn)).setTextColor(nvy0Var.c);
            ((ProgressBar) requireView.findViewById(h9h0.msg_webview_progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(nvy0Var.a));
            ((TextView) requireView.findViewById(h9h0.msg_webview_progress_text)).setTextColor(i3);
            d1b d1bVar = rd00Var.c;
            c1b c = d1bVar.d.c(mainWebMessengerFragment, rd00Var, chatWebViewController$IntentPage);
            d1bVar.b(c);
            rd00Var.F = c.p();
            ew2Var.c("wm_load_main_page", gw00.e(new Pair("intent_page", chatWebViewController$IntentPage.name())));
            String string4 = requireArguments.getString("STATE_KEY_META");
            heb hebVar2 = rd00Var.F;
            if (j8bVar != null) {
                if (hebVar2 != null) {
                    String str = rd00Var.E;
                    v5s0 v5s0Var = new v5s0();
                    v5s0Var.a = j8bVar;
                    v5s0Var.b = string4;
                    v5s0Var.c = str;
                    hebVar2.t = v5s0Var;
                    hebVar2.h();
                }
            } else if (hebVar2 != null) {
                hebVar2.t = new w5s0();
                hebVar2.h();
            }
            rd00Var.E = null;
            ew2Var.c("wm_chat_frame_created", gw00.e(new Pair("intent_page", chatWebViewController$IntentPage.name())));
        }
    }

    public MainWebMessengerFragment() {
    }
}
