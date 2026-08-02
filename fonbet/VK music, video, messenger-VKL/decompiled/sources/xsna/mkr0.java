package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import xsna.ux30;

/* compiled from: VcCallback.kt */
/* loaded from: classes2.dex */
public interface mkr0 {
    void A();

    void B(long j, boolean z);

    void B0(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo);

    void C(ux30.b bVar, SearchMode searchMode, int i);

    boolean D();

    boolean E();

    void F(boolean z);

    boolean G();

    void Q(qtd0 qtd0Var, ImSearchItemLoggingInfo imSearchItemLoggingInfo);

    void U(CharSequence charSequence, SearchMode searchMode);

    void Y(Dialog dialog, int i);

    void d();

    void j0(long j, boolean z);

    void m0(String str);

    void o0(CharSequence charSequence, SearchMode searchMode);

    void t0(ImSearchAnalytics.ClickAction clickAction, ImSearchItemLoggingInfo imSearchItemLoggingInfo);

    void y0(long j, boolean z);

    default void H() {
    }

    default void a0() {
    }

    default void f0() {
    }

    default void p0() {
    }

    default void z0() {
    }

    default void v0(String str) {
    }
}
