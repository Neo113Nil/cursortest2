package com.google.firebase.components;

import defpackage.j0d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class DependencyCycleException extends DependencyException {
    private final List<j0d> componentsInCycle;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.componentsInCycle = arrayList;
    }
}
