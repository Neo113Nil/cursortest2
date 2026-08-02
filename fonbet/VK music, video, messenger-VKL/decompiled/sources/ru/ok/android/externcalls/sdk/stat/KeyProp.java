package ru.ok.android.externcalls.sdk.stat;

import xsna.i7f0;
import xsna.qcy;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public interface KeyProp<V> extends i7f0<StatGroup, StatKey<? extends V>> {
    @Override // xsna.i7f0
    /* synthetic */ Object getValue(StatGroup statGroup, qcy qcyVar);

    StatKey<V> getValue();
}
