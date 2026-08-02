package ru.ok.android.externcalls.sdk.stat;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gzs;
import xsna.msy;
import xsna.pzl;
import xsna.yzs;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class SelfRefKeyProp$construct$1<V> implements StatKey<V>, StatBehavior {
    private final /* synthetic */ KeyPropBehavior $$delegate_0;
    final /* synthetic */ yzs<StatKey<? extends V>, StatPack, InnerExtractionContext, V> $extractor;
    private final Lazy fullName$delegate;
    private final StatGroup group;
    private final String name;
    final /* synthetic */ SelfRefKeyProp<V> this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public SelfRefKeyProp$construct$1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, yzs<? super StatKey<? extends V>, ? super StatPack, ? super InnerExtractionContext, ? extends V> yzsVar, SelfRefKeyProp<V> selfRefKeyProp) {
        this.$extractor = yzsVar;
        this.this$0 = selfRefKeyProp;
        this.$$delegate_0 = keyPropBehavior;
        this.name = str;
        this.group = statGroup;
        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.SelfRefKeyProp$construct$1$fullName$2
            @Override // xsna.gzs
            public final String invoke() {
                return pzl.b(StatGroup.this.getFullName(), ".", str);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
    public V doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
        return this.$extractor.invoke(this.this$0.getValue(), statPack, innerExtractionContext);
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getDerived() {
        return this.$$delegate_0.getDerived();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
    public String getFullName() {
        return (String) this.fullName$delegate.getValue();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
    public StatGroup getGroup() {
        return this.group;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getHumanReadable() {
        return this.$$delegate_0.getHumanReadable();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getMonotonic() {
        return this.$$delegate_0.getMonotonic();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
    public String getName() {
        return this.name;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getStatic() {
        return this.$$delegate_0.getStatic();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getSynthetic() {
        return this.$$delegate_0.getSynthetic();
    }
}
