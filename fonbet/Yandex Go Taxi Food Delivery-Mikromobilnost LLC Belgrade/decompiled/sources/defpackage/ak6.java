package defpackage;

import android.content.res.Configuration;

/* loaded from: classes11.dex */
public interface ak6 {
    void onBrickAttach();

    default void onBrickConfigurationChanged(Configuration configuration) {
    }

    void onBrickDetach();

    void onBrickPause();

    void onBrickResume();

    void onBrickStart();

    void onBrickStop();
}
