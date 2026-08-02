package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import xsna.gz5;
import xsna.kg8;

/* loaded from: classes11.dex */
public class ApexHomeBadger implements gz5 {
    @Override // xsna.gz5
    public final List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // xsna.gz5
    public final void b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        kg8.a(context, intent);
    }
}
