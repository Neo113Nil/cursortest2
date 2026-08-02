package xsna;

import android.content.Context;
import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.Regex;

/* compiled from: SinglePreferenceMigrationV2.kt */
/* loaded from: classes17.dex */
public final class mvj0 extends rn6 {
    public final String h;
    public final SinglePreferenceMigrationType i;
    public final SinglePreferenceMigrationType j;
    public final SinglePreferenceMigrationType k;
    public final SinglePreferenceMigrationType l;
    public final SinglePreferenceMigrationType m;
    public final boolean n;

    public mvj0(ReentrantLock reentrantLock, ReentrantReadWriteLock.WriteLock writeLock, ReentrantReadWriteLock.WriteLock writeLock2, Context context, long j) {
        super(reentrantLock, writeLock, writeLock2, context, j);
        this.h = "successMigrationMarkerV2";
        SinglePreferenceMigrationType singlePreferenceMigrationType = SinglePreferenceMigrationType.TO_FULL_SINGLE;
        this.i = singlePreferenceMigrationType;
        this.j = singlePreferenceMigrationType;
        this.k = SinglePreferenceMigrationType.TO_FULL_SINGLE_WITHOUT_CREATE;
        this.l = SinglePreferenceMigrationType.FROM_FULL_SINGLE;
        this.m = SinglePreferenceMigrationType.FROM_FULL_SINGLE_WITHOUT_ROLLBACK;
        this.n = true;
    }

    @Override // xsna.rn6
    public final SinglePreferenceMigrationType g() {
        return this.l;
    }

    @Override // xsna.rn6
    public final SinglePreferenceMigrationType h() {
        return this.m;
    }

    @Override // xsna.rn6
    public final SinglePreferenceMigrationType i() {
        return this.i;
    }

    @Override // xsna.rn6
    public final SinglePreferenceMigrationType j() {
        return this.j;
    }

    @Override // xsna.rn6
    public final SinglePreferenceMigrationType k() {
        return this.k;
    }

    @Override // xsna.rn6
    public final boolean m() {
        return this.n;
    }

    @Override // xsna.rn6
    public final String n() {
        return this.h;
    }

    @Override // xsna.rn6
    public final String p(File file, String str) {
        return new Regex("name=\"([^\"]+)\"").h(str, new com.vk.movika.sdk.base.observable.a0(drm0.n0(file.getName(), ".").concat("__"), 4));
    }
}
