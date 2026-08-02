package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.du11;
import defpackage.g0d;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.j3y;
import defpackage.jfy;
import defpackage.jgg0;
import defpackage.jhe0;
import defpackage.l1d;
import defpackage.p56;
import defpackage.yhl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final j3y a = new j3y(new l1d(1));
    public static final j3y b = new j3y(new l1d(2));
    public static final j3y c = new j3y(new l1d(3));
    public static final j3y d = new j3y(new l1d(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        jgg0 jgg0Var = new jgg0(ig4.class, ScheduledExecutorService.class);
        jgg0[] jgg0VarArr = {new jgg0(ig4.class, ExecutorService.class), new jgg0(ig4.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(jgg0Var);
        for (jgg0 jgg0Var2 : jgg0VarArr) {
            jhe0.a(jgg0Var2, "Null interface");
        }
        Collections.addAll(hashSet, jgg0VarArr);
        j0d j0dVar = new j0d(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new yhl(13), hashSet3);
        jgg0 jgg0Var3 = new jgg0(p56.class, ScheduledExecutorService.class);
        jgg0[] jgg0VarArr2 = {new jgg0(p56.class, ExecutorService.class), new jgg0(p56.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(jgg0Var3);
        for (jgg0 jgg0Var4 : jgg0VarArr2) {
            jhe0.a(jgg0Var4, "Null interface");
        }
        Collections.addAll(hashSet4, jgg0VarArr2);
        j0d j0dVar2 = new j0d(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new yhl(14), hashSet6);
        jgg0 jgg0Var5 = new jgg0(jfy.class, ScheduledExecutorService.class);
        jgg0[] jgg0VarArr3 = {new jgg0(jfy.class, ExecutorService.class), new jgg0(jfy.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(jgg0Var5);
        for (jgg0 jgg0Var6 : jgg0VarArr3) {
            jhe0.a(jgg0Var6, "Null interface");
        }
        Collections.addAll(hashSet7, jgg0VarArr3);
        j0d j0dVar3 = new j0d(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new yhl(15), hashSet9);
        g0d a2 = j0d.a(new jgg0(du11.class, Executor.class));
        a2.g = new yhl(16);
        return Arrays.asList(j0dVar, j0dVar2, j0dVar3, a2.c());
    }
}
