package xsna;

import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: OnMediaPlaceable.kt */
/* loaded from: classes18.dex */
public interface n880 {
    NewsEntry H0();

    default View R3() {
        return null;
    }

    default p880 getState() {
        return new p880(false, 0);
    }

    void i3();

    void s4(String str);

    default void Y0(izs<? super o880, s3q0> izsVar) {
    }

    default void i2(izs<? super o880, s3q0> izsVar) {
    }
}
