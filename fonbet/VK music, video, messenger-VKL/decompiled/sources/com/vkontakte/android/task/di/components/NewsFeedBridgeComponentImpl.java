package com.vkontakte.android.task.di.components;

import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.topics.api.di.TopicsComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aba;
import xsna.bba;
import xsna.c8m;
import xsna.cba;
import xsna.dba;
import xsna.fpf0;
import xsna.g8m;
import xsna.gd60;
import xsna.msy;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.uia;
import xsna.zaa;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class NewsFeedBridgeComponentImpl implements NewsFeedBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final ProfileFragmentProviderComponent f;
    public final nwy g = new nwy(new uia(this, 6));

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<NewsFeedBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            zaa zaaVar = new zaa(g8mVar, 2);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new NewsFeedBridgeComponentImpl(msy.a(lazyThreadSafetyMode, zaaVar), msy.a(lazyThreadSafetyMode, new aba(g8mVar, 2)), msy.a(lazyThreadSafetyMode, new bba(g8mVar, 2)), msy.a(lazyThreadSafetyMode, new cba(g8mVar, 2)), msy.a(lazyThreadSafetyMode, new dba(g8mVar, 2)), (ProfileFragmentProviderComponent) g8mVar.a(fpf0.a(ProfileFragmentProviderComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsFeedBridgeComponentImpl.class, "newsfeedBridge", "getNewsfeedBridge()Lcom/vk/newsfeed/api/NewsfeedBridge;", 0);
        fpf0.a.getClass();
        h = new qcy[]{propertyReference1Impl};
    }

    public NewsFeedBridgeComponentImpl(Lazy<? extends ClipsPrecacheComponent> lazy, Lazy<? extends TopicsComponent> lazy2, Lazy<? extends StorefrontServicesComponent> lazy3, Lazy<? extends ClassifiedsComponent> lazy4, Lazy<? extends PhotosComponent> lazy5, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = profileFragmentProviderComponent;
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedBridgeComponent
    public final gd60 Ad() {
        qcy<Object> qcyVar = h[0];
        return (gd60) this.g.c();
    }
}
