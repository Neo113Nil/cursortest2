package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.core.apps.BuildInfo;

/* compiled from: VkRoomDatabase.kt */
/* loaded from: classes.dex */
public final class bhv0 {
    public static final RoomDatabase.a a(Context context, String str, Class cls) {
        RoomDatabase.a a = androidx.room.i.a(context, str, cls);
        if (BuildInfo.m()) {
            a.i = true;
        }
        return a;
    }
}
