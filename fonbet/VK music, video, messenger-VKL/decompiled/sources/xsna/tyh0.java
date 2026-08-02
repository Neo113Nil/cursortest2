package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import xsna.vha;

/* compiled from: SearchStatCatalogConfigurationWrapper.kt */
/* loaded from: classes16.dex */
public final class tyh0 implements CatalogConfiguration {
    public final /* synthetic */ CatalogConfiguration b;
    public final k140 c = new k140(new h2w(23));

    /* compiled from: SearchStatCatalogConfigurationWrapper.kt */
    public static final class a extends z160 {
        @Override // xsna.vha
        public final c2q0 o(RecyclerView recyclerView) {
            return new vha.a(this, recyclerView, null, new q5u0(0.8f, 0.8f), 4);
        }
    }

    public tyh0(CatalogConfiguration catalogConfiguration) {
        this.b = catalogConfiguration;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.c.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final androidx.recyclerview.widget.o0 B(CatalogViewType catalogViewType) {
        return this.b.B(catalogViewType);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int C(UIBlock uIBlock) {
        return this.b.C(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        return this.b.D(str, str2, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final void E(u4a u4aVar) {
        this.b.E(u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.b.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Boolean G(lca lcaVar, tca tcaVar) {
        return this.b.G(lcaVar, tcaVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean J() {
        return this.b.J();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return this.b.K(u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean L() {
        return this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final db80 M(CatalogConfiguration.AutoPlayEntryPoint autoPlayEntryPoint) {
        return this.b.M(autoPlayEntryPoint);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final wba N() {
        return this.b.N();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean O(UserId userId) {
        return this.b.O(userId);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean P() {
        return this.b.P();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean Q(UIBlock uIBlock) {
        return this.b.Q(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int R() {
        return this.b.R();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return this.b.S(u4aVar, str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final void T(RecyclerView recyclerView) {
        this.b.T(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final gda U() {
        return this.b.U();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final db80 V() {
        return this.b.V();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final ayn0 W(RecyclerView recyclerView) {
        return this.b.W(recyclerView);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String X(Context context, int i, UIBlock uIBlock, s8a s8aVar) {
        return this.b.X(context, i, uIBlock, s8aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String getRef() {
        return this.b.getRef();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return this.b.getVideoAutoPlayDelayType();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final UserId q() {
        return this.b.q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        return this.b.r();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final qca s() {
        return this.b.s();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String t() {
        return this.b.t();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int u(UIBlock uIBlock) {
        return this.b.u(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final int v() {
        return this.b.v();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        return this.b.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return this.b.x(userId, str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean y() {
        return this.b.y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType) {
        return this.b.z(lcaVar, catalogConfiguration$Companion$ContainerType);
    }
}
