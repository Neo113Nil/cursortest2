package com.vkontakte.android.task.di.components;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.im.ui.max.MaxRedirectHandler;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.qcy;
import xsna.uho0;

/* compiled from: VkMaxUtilityComponent.kt */
/* loaded from: classes7.dex */
public final class VkMaxUtilityComponent implements MaxUtilityComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final AppContextDiComponent a;
    public final ewy b = new ewy(new uho0(this, 17));

    /* compiled from: VkMaxUtilityComponent.kt */
    public static final class a implements b7m<MaxUtilityComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VkMaxUtilityComponent((AppContextDiComponent) e7mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VkMaxUtilityComponent.class, "redirectHandler", "getRedirectHandler()Lcom/vk/im/ui/max/MaxRedirectHandler;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public VkMaxUtilityComponent(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
    }

    @Override // com.vk.im.ui.di.MaxUtilityComponent
    public final MaxRedirectHandler j7() {
        qcy<Object> qcyVar = c[0];
        return (MaxRedirectHandler) this.b.c();
    }
}
