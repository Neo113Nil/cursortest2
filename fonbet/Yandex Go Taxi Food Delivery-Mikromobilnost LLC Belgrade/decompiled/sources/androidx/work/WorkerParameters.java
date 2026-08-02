package androidx.work;

import android.net.Network;
import defpackage.fse;
import defpackage.m951;
import defpackage.na51;
import defpackage.ong;
import defpackage.t951;
import defpackage.y951;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class WorkerParameters {
    public UUID a;
    public ong b;
    public HashSet c;
    public a d;
    public int e;
    public ExecutorService f;
    public fse g;
    public t951 h;
    public na51 i;
    public y951 j;
    public m951 k;

    /* loaded from: classes.dex */
    public static class a {
        public List a;
        public List b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }
}
