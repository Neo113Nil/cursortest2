package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import defpackage.v7p;

/* loaded from: classes10.dex */
public final class Div2ViewLocator_Factory implements v7p {

    public static final class InstanceHolder {
        static final Div2ViewLocator_Factory INSTANCE = new Div2ViewLocator_Factory();

        private InstanceHolder() {
        }
    }

    public static Div2ViewLocator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Div2ViewLocator newInstance() {
        return new Div2ViewLocator();
    }

    @Override // defpackage.yvf0
    public Div2ViewLocator get() {
        return newInstance();
    }
}
