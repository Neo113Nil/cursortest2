package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.ArrayMap;
import android.util.SparseIntArray;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.chat.clips.decoration.api.di.DialogClipsContextComponent;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vkontakte.android.R;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ci8;
import xsna.e3m;
import xsna.t53;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ae A[SYNTHETIC] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Iterator it;
        boolean z;
        DialogThemeImpl dialogThemeImpl;
        SparseIntArray c;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list;
        boolean z2 = false;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.c;
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return Integer.valueOf(aboutAppFragment.requireArguments().getInt("appId"));
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                int i = AlbumDetailsFragment.p0;
                return ((BridgeComponent) albumDetailsFragment.f0.getValue()).a0();
            case 2:
                return Boolean.valueOf((((wv70) this.c).a() & 9223372034707292159L) != 9205357640488583168L);
            case 3:
                ml2 ml2Var = (ml2) this.c;
                if (!ml2Var.m) {
                    ml2Var.g(true);
                }
                return s3q0.a;
            case 4:
                return (WebApiApplication) ((t53.d.a) this.c).l;
            case 5:
                cx3 cx3Var = (cx3) this.c;
                Context context = cx3Var.a;
                az9 az9Var = new az9(context, cx3Var.b);
                List<String> list2 = az9.f;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (String str : list2) {
                    CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
                    arrayList.add(c.a.a(str));
                }
                InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("scheme_messages.json"));
                try {
                    JSONObject jSONObject = new JSONObject(a0a.b(inputStreamReader));
                    inputStreamReader.close();
                    inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("palette_messages.json"));
                    try {
                        JSONObject jSONObject2 = new JSONObject(a0a.b(inputStreamReader));
                        inputStreamReader.close();
                        ArrayMap arrayMap = new ArrayMap(jSONObject2.length());
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            arrayMap.put(next, Integer.valueOf(Color.parseColor(jSONObject2.getString(next))));
                        }
                        ArrayMap arrayMap2 = new ArrayMap();
                        arrayMap2.putAll(arrayMap);
                        ArrayMap arrayMap3 = new ArrayMap();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            com.vk.im.engine.models.dialogs.c cVar = (com.vk.im.engine.models.dialogs.c) it2.next();
                            ArrayMap arrayMap4 = new ArrayMap();
                            Iterator<String> keys2 = jSONObject.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                List<VKTheme> list3 = az9Var.b;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : list3) {
                                    if (epx.f(((VKTheme) obj).d, next2)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    VKTheme vKTheme = (VKTheme) it3.next();
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(next2).getJSONObject("colors");
                                    try {
                                        try {
                                            c = az9Var.c(jSONObject3, cVar, arrayMap2);
                                            it = it3;
                                        } catch (Resources.NotFoundException e) {
                                            e = e;
                                            it = it3;
                                        } catch (JSONException e2) {
                                            e = e2;
                                            it = it3;
                                        }
                                    } catch (Resources.NotFoundException e3) {
                                        e = e3;
                                        it = it3;
                                        z = z2;
                                    } catch (JSONException e4) {
                                        e = e4;
                                        it = it3;
                                        z = z2;
                                    }
                                    try {
                                        List e5 = az9Var.e(jSONObject3, cVar, arrayMap2, z3);
                                        z = false;
                                        try {
                                            dialogThemeImpl = new DialogThemeImpl(c, e5, az9Var.e(jSONObject3, cVar, arrayMap2, false));
                                        } catch (Resources.NotFoundException e6) {
                                            e = e6;
                                            L.i(e);
                                            dialogThemeImpl = null;
                                            if (dialogThemeImpl != null) {
                                            }
                                            z2 = z;
                                            it3 = it;
                                            z3 = true;
                                        } catch (JSONException e7) {
                                            e = e7;
                                            L.i(e);
                                            dialogThemeImpl = null;
                                            if (dialogThemeImpl != null) {
                                            }
                                            z2 = z;
                                            it3 = it;
                                            z3 = true;
                                        }
                                    } catch (Resources.NotFoundException e8) {
                                        e = e8;
                                        z = false;
                                        L.i(e);
                                        dialogThemeImpl = null;
                                        if (dialogThemeImpl != null) {
                                        }
                                        z2 = z;
                                        it3 = it;
                                        z3 = true;
                                    } catch (JSONException e9) {
                                        e = e9;
                                        z = false;
                                        L.i(e);
                                        dialogThemeImpl = null;
                                        if (dialogThemeImpl != null) {
                                        }
                                        z2 = z;
                                        it3 = it;
                                        z3 = true;
                                    }
                                    if (dialogThemeImpl != null) {
                                        arrayMap4.put(vKTheme, dialogThemeImpl);
                                    }
                                    z2 = z;
                                    it3 = it;
                                    z3 = true;
                                }
                            }
                            arrayMap3.put(cVar, new DialogTheme(cVar, null, arrayMap4, null, 10, null));
                            z3 = true;
                        }
                        return arrayMap3;
                    } finally {
                    }
                } finally {
                }
            case 6:
                fxc0.B().d((VideoFile) this.c);
                return s3q0.a;
            case 7:
                return ((com.vk.auth.a) this.c).b.b;
            case 8:
                com.vk.im.ui.views.avatars.b bVar = (com.vk.im.ui.views.avatars.b) this.c;
                GradientDrawable a = ful0.a(1);
                abg0 abg0Var = dhr0.u;
                a.setColor(abg0Var.c(R.attr.vk_ui_image_placeholder));
                Context context2 = bVar.a;
                e3m.a aVar = e3m.a;
                Drawable a2 = m33.a(R.drawable.vk_icon_users_24_white, context2);
                Drawable mutate = a2 != null ? a2.mutate() : null;
                if (mutate != null) {
                    mutate.setTint(abg0Var.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary));
                }
                LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) rl3.I(new Drawable[]{a, mutate}).toArray(new Drawable[0]));
                int b = cn70.b(8);
                layerDrawable.setLayerInset(1, b, b, b, b);
                layerDrawable.setLayerGravity(1, 17);
                return layerDrawable;
            case 9:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c((View) ((j96) this.c).g.invoke())).a(fpf0.a(StoryEditorExtDepsComponent.class))).R();
            case 10:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                int i2 = BasePhotoListFragment.m0;
                basePhotoListFragment.finish();
                return s3q0.a;
            case 11:
                g1k0 g1k0Var = (g1k0) this.c;
                bwf<Float> bwfVar = g1k0Var.b;
                float floatValue = bwfVar.getStart().floatValue();
                float floatValue2 = bwfVar.c().floatValue() - floatValue;
                return Float.valueOf(swe0.f(floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (swe0.f(g1k0Var.c(), bwfVar.getStart().floatValue(), bwfVar.c().floatValue()) - floatValue) / floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 12:
                ((oh7) this.c).d.e();
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((BookingEditScreenState.InfoBlock) ((mtk0) this.c).getValue()).i);
            case 14:
                bi8 bi8Var = (bi8) this.c;
                ci8.a aVar2 = ci8.a.a;
                if (bi8Var.m) {
                    bi8Var.j.onNext(aVar2);
                }
                return s3q0.a;
            case 15:
                ((gm9) this.c).b0();
                return s3q0.a;
            case 16:
                ((com.vk.im.channelcreation.impl.h) this.c).O(g.m.b);
                return s3q0.a;
            case 17:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.c;
                int i3 = ChatClipsReplyFragment.T;
                bpn0 bpn0Var = uob.a;
                oob a3 = uob.a(chatClipsReplyFragment, chatClipsReplyFragment.fo().e);
                chatClipsReplyFragment.D.a(new bpb(a3, chatClipsReplyFragment));
                return a3;
            case 18:
                com.vk.im.ui.components.msg_list.a aVar3 = ((ChatFragment) this.c).H0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                if (aVar3.O0.j || (list = aVar3.O0.g().c) == null) {
                    return null;
                }
                return Boolean.valueOf(list.isEmpty());
            case 19:
                io.reactivex.rxjava3.disposables.c cVar2 = ((cxb) this.c).x.i;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return s3q0.a;
            case 20:
                return ((StoriesComponent) ((k7m) m7m.f((qkc) this.c)).a(fpf0.a(StoriesComponent.class))).o7();
            case 21:
                x6d x6dVar = (x6d) this.c;
                return new n5p0(x6dVar.i, x6dVar.e.a);
            case 22:
                cfd cfdVar = (cfd) this.c;
                cfdVar.R0 = true;
                cfdVar.O0.setVisibility(8);
                return s3q0.a;
            case 23:
                return (VkGroupHeader) ((View) this.c).findViewById(R.id.clips_authors_list_header);
            case 24:
                return ((ClipActionsComponent) ((k7m) m7m.f((ekd) this.c)).mo408a(fpf0.a(ClipActionsComponent.class))).q5();
            case 25:
                ClipsEditorFragment clipsEditorFragment = (ClipsEditorFragment) this.c;
                Integer num = ClipsEditorFragment.W;
                return (ClipsUploadVkComponent) m7m.d(clipsEditorFragment).a(fpf0.a(ClipsUploadVkComponent.class));
            case 26:
                ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) this.c;
                int i4 = ClipsFavoriteFoldersListFragment.U;
                a.f fVar = a.f.b;
                clipsFavoriteFoldersListFragment.getClass();
                xn50.a.c(clipsFavoriteFoldersListFragment, fVar);
                return s3q0.a;
            case 27:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return (ClipsPlaylistsComponent) m7m.d(clipsGridFragment).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 28:
                return ((DialogClipsContextComponent) ((k7m) m7m.f((kke) this.c)).a(fpf0.a(DialogClipsContextComponent.class))).z();
            default:
                return Integer.valueOf(((wow) ((wh50) this.c).getValue()).b.size());
        }
    }
}
