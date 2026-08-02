package ru.ok.android.externcalls.sdk.stat;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.hri0;
import xsna.msy;
import xsna.pzl;
import xsna.zcl;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public abstract class StatGroup {
    private final Set<StatKey<?>> all;
    private final Lazy fullName$delegate;
    private final String name;
    private final StatGroup parent;
    private final Set<StatKey<?>> statSet;

    public /* synthetic */ StatGroup(String str, StatGroup statGroup, zcl zclVar) {
        this(str, statGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fullName_delegate$lambda$0(StatGroup statGroup) {
        StatGroup statGroup2 = statGroup.parent;
        return statGroup2 != null ? pzl.b(statGroup2.getFullName(), ".", statGroup.name) : statGroup.name;
    }

    public final Set<StatKey<?>> getAll() {
        return this.all;
    }

    public final String getFullName() {
        return (String) this.fullName$delegate.getValue();
    }

    public final String getName() {
        return this.name;
    }

    public final StatGroup getParent() {
        return this.parent;
    }

    public final Set<StatKey<?>> getStatSet$calls_sdk_stat_release() {
        return this.statSet;
    }

    public final void register$calls_sdk_stat_release(KeyProp<?> keyProp) {
        this.statSet.add(keyProp.getValue());
    }

    private StatGroup(String str, StatGroup statGroup) {
        this.name = str;
        this.parent = statGroup;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.statSet = linkedHashSet;
        this.all = linkedHashSet;
        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new hri0(this, 1));
    }

    public /* synthetic */ StatGroup(String str, StatGroup statGroup, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : statGroup, null);
    }
}
