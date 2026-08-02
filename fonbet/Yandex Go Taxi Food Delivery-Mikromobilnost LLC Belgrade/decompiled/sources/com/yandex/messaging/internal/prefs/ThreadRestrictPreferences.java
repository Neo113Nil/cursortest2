package com.yandex.messaging.internal.prefs;

import android.content.SharedPreferences;
import android.os.Looper;
import defpackage.ny61;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class ThreadRestrictPreferences implements SharedPreferences {
    private final Looper mAllowedThread;
    private final SharedPreferences mOriginal;

    public ThreadRestrictPreferences(Looper looper, SharedPreferences sharedPreferences) {
        this.mAllowedThread = looper;
        this.mOriginal = sharedPreferences;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.mOriginal.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.mAllowedThread == Looper.myLooper()) {
            return this.mOriginal.edit();
        }
        ny61.k();
        return null;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.mOriginal.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.mOriginal.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.mOriginal.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.mOriginal.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.mOriginal.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return this.mOriginal.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return this.mOriginal.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (this.mAllowedThread == Looper.myLooper()) {
            this.mOriginal.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            ny61.k();
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (this.mAllowedThread == Looper.myLooper()) {
            this.mOriginal.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } else {
            ny61.k();
        }
    }
}
