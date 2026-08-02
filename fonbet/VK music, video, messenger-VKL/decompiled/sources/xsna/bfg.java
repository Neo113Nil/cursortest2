package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.webapp.fragments.ReportFragment;
import java.util.ArrayList;
import xsna.bja0;
import xsna.cc6;

/* compiled from: CommentsListContract.kt */
/* loaded from: classes3.dex */
public interface bfg<T extends cc6> extends dc6<T> {
    void Ah();

    void B2(boolean z);

    void B3();

    void Cd(UserId userId, String str, LinkButton linkButton);

    void I9();

    void Ic(boolean z);

    void Jg(NewsComment newsComment, aa aaVar);

    default boolean L7() {
        return false;
    }

    void Nh(UserId userId, String str);

    boolean Pj();

    void Ql(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var);

    void Rb(int i);

    void V0();

    boolean W1();

    void Xh(String str, ArrayList arrayList);

    void a(io.reactivex.rxjava3.disposables.c cVar);

    void bm(int i);

    void d0();

    void d6(int i);

    void eg(NewsComment newsComment);

    void f6(boolean z);

    FragmentImpl g();

    Context getContext();

    com.vk.lists.c gj(c.h hVar);

    void in();

    void k0();

    void k6(boolean z);

    void o0();

    void r1(bja0.a aVar);

    void s();

    default boolean t2() {
        return true;
    }

    void u1(com.vk.lists.c cVar);

    void wf(int i);

    void x(int i);

    void y2();

    void y7(ReportFragment.a aVar);

    boolean z(rdg rdgVar);

    default void A7() {
    }

    default void D() {
    }

    default void Df() {
    }

    default void P5() {
    }

    default void jl() {
    }

    default void nf() {
    }

    default void s2() {
    }

    default void ub() {
    }

    default void Ch(String str) {
    }

    default void Lm(iag iagVar) {
    }

    default void Za(iag iagVar) {
    }

    default void ge(int i) {
    }

    default void ua(boolean z) {
    }

    default void y5(iag iagVar) {
    }

    default void Ec(UserId userId, NewsComment newsComment) {
    }
}
