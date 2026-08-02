package com.yandex.messenger.websdk.internal.webview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import defpackage.d1b;
import defpackage.y0b;
import defpackage.ye0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"com/yandex/messenger/websdk/internal/webview/ChatBackgroundController$BackgroundFragment", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Ld1b;", "preloadingInstance", "Ld1b;", "getPreloadingInstance", "()Ld1b;", "setPreloadingInstance", "(Ld1b;)V", "", "isViewCreated", "Z", "()Z", "setViewCreated", "(Z)V", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatBackgroundController$BackgroundFragment extends Fragment {
    private boolean isViewCreated;
    private d1b preloadingInstance;

    public final d1b getPreloadingInstance() {
        return this.preloadingInstance;
    }

    /* renamed from: isViewCreated, reason: from getter */
    public final boolean getIsViewCreated() {
        return this.isViewCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Context context = inflater.getContext();
        return new FrameLayout(context) { // from class: com.yandex.messenger.websdk.internal.webview.ChatBackgroundController$BackgroundFragment$onCreateView$1
            {
                setVisibility(4);
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                ((ViewGroup) getParent()).isShown();
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        d1b d1bVar = this.preloadingInstance;
        if (d1bVar != null) {
            setPreloadingInstance(null);
            Object obj = d1bVar.d;
            y0b y0bVar = obj instanceof y0b ? (y0b) obj : null;
            if (equals(y0bVar != null ? y0bVar.a() : null)) {
                d1bVar.b(d1bVar.d.n());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ye0 a;
        super.onDestroyView();
        this.isViewCreated = false;
        d1b d1bVar = this.preloadingInstance;
        if (d1bVar == null || (a = d1bVar.a(this)) == null) {
            return;
        }
        d1bVar.b(a.d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ye0 a;
        this.isViewCreated = true;
        d1b d1bVar = this.preloadingInstance;
        if (d1bVar == null || (a = d1bVar.a(this)) == null) {
            return;
        }
        d1bVar.b(a.b());
    }

    public final void setPreloadingInstance(d1b d1bVar) {
        this.preloadingInstance = d1bVar;
    }

    public final void setViewCreated(boolean z) {
        this.isViewCreated = z;
    }
}
