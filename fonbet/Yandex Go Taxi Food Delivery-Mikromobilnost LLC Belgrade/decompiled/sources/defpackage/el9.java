package defpackage;

/* loaded from: classes12.dex */
public interface el9 extends e6v {
    hba getAction();

    @Override // defpackage.e6v
    default String getId() {
        return getTitle().toString();
    }

    CharSequence getTitle();
}
