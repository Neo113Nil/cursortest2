package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: UpcomigContract.kt */
/* loaded from: classes3.dex */
public interface a7q0 extends rr6<z6q0>, i7q0 {
    default boolean L3() {
        return false;
    }

    wcf0 getRecommended();

    void j0();

    @Override // xsna.rr6
    default void pause() {
        wcf0 recommended = getRecommended();
        if (recommended != null) {
            recommended.pause();
        }
        z6q0 presenter = getPresenter();
        if (presenter != null) {
            presenter.pause();
        }
    }

    @Override // xsna.rr6
    default void release() {
        wcf0 recommended = getRecommended();
        if (recommended != null) {
            recommended.release();
        }
        z6q0 presenter = getPresenter();
        if (presenter != null) {
            presenter.release();
        }
    }

    @Override // xsna.rr6
    default void resume() {
        wcf0 recommended = getRecommended();
        if (recommended != null) {
            recommended.resume();
        }
        z6q0 presenter = getPresenter();
        if (presenter != null) {
            presenter.resume();
        }
    }

    default void S3() {
    }

    default void s4() {
    }

    default void t0() {
    }

    default void C0(UserId userId) {
    }

    default void Z(boolean z) {
    }

    default void q1(String str) {
    }

    default void setTopBlockTopMargin(int i) {
    }

    default void T3(int i, int i2) {
    }

    default void e4(int i, int i2) {
    }

    default void i1(int i, Object... objArr) {
    }

    default void b2(String str, String str2, boolean z) {
    }
}
