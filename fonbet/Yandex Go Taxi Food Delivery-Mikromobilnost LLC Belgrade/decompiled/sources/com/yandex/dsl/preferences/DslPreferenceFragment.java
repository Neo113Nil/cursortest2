package com.yandex.dsl.preferences;

import android.os.Bundle;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.TwoStatePreference;
import defpackage.ffr;
import defpackage.l4o;
import defpackage.oqo;
import defpackage.r96;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030 *\u00020\u001f2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010!\"\u0004\b\u001d\u0010\"R0\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030$*\u00020#2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010%\"\u0004\b\u001d\u0010&R4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0$*\u00020'2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010(\"\u0004\b\u001d\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/dsl/preferences/DslPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lffr;", "flagPreferenceProvider", "Lkotlin/Function1;", "Lzy11;", "init", "<init>", "(Lffr;Ltls;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "rootKey", "onCreatePreferences", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Lffr;", "Ltls;", "onPreferencesCreated", "getOnPreferencesCreated", "()Ltls;", "setOnPreferencesCreated", "(Ltls;)V", "Landroidx/preference/TwoStatePreference;", "Lr96;", "flag", "getFlag", "(Landroidx/preference/TwoStatePreference;)Lr96;", "setFlag", "(Landroidx/preference/TwoStatePreference;Lr96;)V", "Landroidx/preference/ListPreference;", "Ll4o;", "(Landroidx/preference/ListPreference;)Ll4o;", "(Landroidx/preference/ListPreference;Ll4o;)V", "Landroidx/preference/EditTextPreference;", "Loqo;", "(Landroidx/preference/EditTextPreference;)Loqo;", "(Landroidx/preference/EditTextPreference;Loqo;)V", "Lcom/yandex/dsl/preferences/TextWithSuggestsPreference;", "(Lcom/yandex/dsl/preferences/TextWithSuggestsPreference;)Loqo;", "(Lcom/yandex/dsl/preferences/TextWithSuggestsPreference;Loqo;)V", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DslPreferenceFragment extends PreferenceFragmentCompat {
    private final ffr flagPreferenceProvider;
    private final tls init;
    private tls onPreferencesCreated;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/dsl/preferences/DslPreferenceFragment;", "Lzy11;", "invoke", "(Lcom/yandex/dsl/preferences/DslPreferenceFragment;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.yandex.dsl.preferences.DslPreferenceFragment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements tls {
        public static final AnonymousClass1 w = new AnonymousClass1(1);

        @Override // defpackage.tls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return zy11.a;
        }
    }

    public /* synthetic */ DslPreferenceFragment(ffr ffrVar, tls tlsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ffrVar, (i & 2) != 0 ? AnonymousClass1.w : tlsVar);
    }

    public static final /* synthetic */ ffr access$getFlagPreferenceProvider$p(DslPreferenceFragment dslPreferenceFragment) {
        dslPreferenceFragment.getClass();
        return null;
    }

    public final r96 getFlag(TwoStatePreference twoStatePreference) {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    public final tls getOnPreferencesCreated() {
        return this.onPreferencesCreated;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        this.init.invoke(this);
        tls tlsVar = this.onPreferencesCreated;
        if (tlsVar != null) {
            tlsVar.invoke(this);
        }
    }

    public final void setFlag(ListPreference listPreference, final l4o l4oVar) {
        listPreference.w(l4oVar.a);
        Object[] enumConstants = l4oVar.c.getEnumConstants();
        ArrayList arrayList = new ArrayList(enumConstants.length);
        for (Object obj : enumConstants) {
            arrayList.add(String.valueOf(obj));
        }
        listPreference.B((CharSequence[]) arrayList.toArray(new String[0]));
        listPreference.p0 = listPreference.o0;
        new sls() { // from class: com.yandex.dsl.preferences.DslPreferenceFragment$flag$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                DslPreferenceFragment.access$getFlagPreferenceProvider$p(DslPreferenceFragment.this);
                throw null;
            }
        }.invoke();
        throw null;
    }

    public final void setOnPreferencesCreated(tls tlsVar) {
        this.onPreferencesCreated = tlsVar;
    }

    public final l4o getFlag(ListPreference listPreference) {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    public final oqo getFlag(EditTextPreference editTextPreference) {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    public DslPreferenceFragment(ffr ffrVar, tls tlsVar) {
        this.init = tlsVar;
    }

    public final oqo getFlag(TextWithSuggestsPreference textWithSuggestsPreference) {
        throw new UnsupportedOperationException("Property does not have a getter");
    }

    public final void setFlag(EditTextPreference editTextPreference, final oqo oqoVar) {
        editTextPreference.w(oqoVar.a);
        new sls() { // from class: com.yandex.dsl.preferences.DslPreferenceFragment$flag$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                DslPreferenceFragment.access$getFlagPreferenceProvider$p(DslPreferenceFragment.this);
                throw null;
            }
        }.invoke();
        throw null;
    }

    public final void setFlag(TwoStatePreference twoStatePreference, final r96 r96Var) {
        twoStatePreference.w(r96Var.a);
        new sls() { // from class: com.yandex.dsl.preferences.DslPreferenceFragment$flag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                DslPreferenceFragment.access$getFlagPreferenceProvider$p(DslPreferenceFragment.this);
                throw null;
            }
        }.invoke();
        throw null;
    }

    public final void setFlag(TextWithSuggestsPreference textWithSuggestsPreference, final oqo oqoVar) {
        textWithSuggestsPreference.w(oqoVar.a);
        new sls() { // from class: com.yandex.dsl.preferences.DslPreferenceFragment$flag$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                DslPreferenceFragment.access$getFlagPreferenceProvider$p(DslPreferenceFragment.this);
                throw null;
            }
        }.invoke();
        throw null;
    }
}
