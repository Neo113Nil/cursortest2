package com.ybsdk.core.common.utils.preferences;

import android.content.SharedPreferences;
import defpackage.i3y;
import defpackage.sls;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJO\u0010\u0012\u001a(\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00110\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b*\u0010)R\u001b\u0010/\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/ybsdk/core/common/utils/preferences/LazySharedPreferences;", "Landroid/content/SharedPreferences;", "Lkotlin/Function0;", "provider", "<init>", "(Lsls;)V", "", "", "getAll", "()Ljava/util/Map;", "key", "defValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "defValues", "kotlin.jvm.PlatformType", "", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getBoolean", "(Ljava/lang/String;Z)Z", "contains", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences$Editor;", "edit", "()Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "l", "Lzy11;", "registerOnSharedPreferenceChangeListener", "(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V", "unregisterOnSharedPreferenceChangeListener", "delegate$delegate", "Li3y;", "getDelegate", "()Landroid/content/SharedPreferences;", "delegate", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LazySharedPreferences implements SharedPreferences {

    /* renamed from: delegate$delegate, reason: from kotlin metadata */
    private final i3y delegate;

    public LazySharedPreferences(sls slsVar) {
        this.delegate = a.a(slsVar);
    }

    private final SharedPreferences getDelegate() {
        return (SharedPreferences) this.delegate.getValue();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        return getDelegate().contains(key);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return getDelegate().edit();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return getDelegate().getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String key, boolean defValue) {
        return getDelegate().getBoolean(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String key, float defValue) {
        return getDelegate().getFloat(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String key, int defValue) {
        return getDelegate().getInt(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String key, long defValue) {
        return getDelegate().getLong(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public String getString(String key, String defValue) {
        return getDelegate().getString(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String key, Set<String> defValues) {
        return getDelegate().getStringSet(key, defValues);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener l) {
        getDelegate().registerOnSharedPreferenceChangeListener(l);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener l) {
        getDelegate().unregisterOnSharedPreferenceChangeListener(l);
    }
}
