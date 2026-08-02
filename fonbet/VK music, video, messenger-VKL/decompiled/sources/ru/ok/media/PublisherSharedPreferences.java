package ru.ok.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* loaded from: classes9.dex */
public class PublisherSharedPreferences {
    private static final String PUBLISHER_PREFS_NAME = "media.publisher.prefs";
    public static final String SLOWPOKE_IDX_NAME = "slowpoke.idx";
    private Integer lastSlowpokeIdxSet;
    private final SharedPreferences sharedPref;

    public PublisherSharedPreferences(Context context) {
        this.sharedPref = Preference.h(context, 0, PUBLISHER_PREFS_NAME);
    }

    public int getSlowpokeIdx() {
        return this.sharedPref.getInt(SLOWPOKE_IDX_NAME, 0);
    }

    public void setSlowpokeIdx(int i) {
        Integer num = this.lastSlowpokeIdxSet;
        if (num == null || num.intValue() != i) {
            this.lastSlowpokeIdxSet = Integer.valueOf(i);
            SharedPreferences.Editor edit = this.sharedPref.edit();
            edit.putInt(SLOWPOKE_IDX_NAME, i);
            edit.apply();
        }
    }
}
