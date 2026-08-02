package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.selection.models.EditorSticker;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.model.ClipsStickerType;
import com.vk.clips.editor.stickers.api.ClipsEditorStickersStyleEditScreen$Type;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stories.model.GifItem;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.c0e;
import xsna.d0e;

/* compiled from: SelectionStickerViewWrapper.kt */
/* loaded from: classes16.dex */
public final class dfi0 implements gov {
    public final Context a;
    public final d0e.a b;
    public final c0e c = new c0e();
    public final efi0 d = new efi0(this);
    public final SelectionStickerView e;

    public dfi0(Context context, d0e.a aVar, boolean z) {
        this.a = context;
        this.b = aVar;
        this.e = new SelectionStickerView(context, SelectionStickerView.OpenFrom.CLIPS, true, new a(), z, true);
    }

    @Override // xsna.gov
    public final void a(Set<? extends ClipsStickerType> set) {
        WebStickerType webStickerType;
        Set<? extends ClipsStickerType> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            switch (ldl0.$EnumSwitchMapping$0[((ClipsStickerType) it.next()).ordinal()]) {
                case 1:
                    webStickerType = WebStickerType.TEXT;
                    break;
                case 2:
                    webStickerType = WebStickerType.STICKER;
                    break;
                case 3:
                    webStickerType = WebStickerType.EMOJI;
                    break;
                case 4:
                    webStickerType = WebStickerType.LOTTIE;
                    break;
                case 5:
                    webStickerType = WebStickerType.PHOTO;
                    break;
                case 6:
                    webStickerType = WebStickerType.HASHTAG;
                    break;
                case 7:
                    webStickerType = WebStickerType.MENTION;
                    break;
                case 8:
                    webStickerType = WebStickerType.QUESTION;
                    break;
                case 9:
                    webStickerType = WebStickerType.MUSIC;
                    break;
                case 10:
                    webStickerType = WebStickerType.MUSIC_PLAYLIST;
                    break;
                case 11:
                    webStickerType = WebStickerType.GEO;
                    break;
                case 12:
                    webStickerType = WebStickerType.GIF;
                    break;
                case 13:
                    webStickerType = WebStickerType.MARKET_ITEM;
                    break;
                case 14:
                    webStickerType = WebStickerType.MARKET_SERVICE_ITEM;
                    break;
                case 15:
                    webStickerType = WebStickerType.SERVICE_YC_ITEM;
                    break;
                case 16:
                    webStickerType = WebStickerType.LINK;
                    break;
                case 17:
                    webStickerType = WebStickerType.TIME;
                    break;
                case 18:
                    webStickerType = WebStickerType.OWNER;
                    break;
                case 19:
                    webStickerType = WebStickerType.REPLY;
                    break;
                case 20:
                    webStickerType = WebStickerType.POST;
                    break;
                case 21:
                    webStickerType = WebStickerType.CLIP_STAT;
                    break;
                case 22:
                    webStickerType = WebStickerType.CLIP;
                    break;
                case 23:
                    webStickerType = WebStickerType.VK_VIDEO;
                    break;
                case 24:
                    webStickerType = WebStickerType.CHANNEL_POST;
                    break;
                case 25:
                    webStickerType = WebStickerType.POLL;
                    break;
                case 26:
                    webStickerType = WebStickerType.APP;
                    break;
                case 27:
                    webStickerType = WebStickerType.SITUATIONAL_THEME;
                    break;
                case 28:
                    webStickerType = WebStickerType.SITUATIONAL_TEMPLATE;
                    break;
                case 29:
                    webStickerType = WebStickerType.PHOTO_ALBUM;
                    break;
                case 30:
                    webStickerType = WebStickerType.TICKET;
                    break;
                case 31:
                    webStickerType = WebStickerType.REACTION;
                    break;
                case 32:
                    webStickerType = WebStickerType.AUDIO_TRACK;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(webStickerType);
        }
        this.e.setPermittedClickableStickers(j5g.S0(arrayList));
    }

    @Override // xsna.gov
    public final boolean a0() {
        afi0 afi0Var = this.e.i0;
        if (afi0Var == null || afi0Var.w != SearchMode.GIF || !afi0Var.e()) {
            return false;
        }
        afi0Var.a();
        return true;
    }

    @Override // xsna.gov
    public final void b() {
        SelectionStickerView selectionStickerView = this.e;
        selectionStickerView.Q.e(selectionStickerView.S.getCurrentItem());
    }

    @Override // xsna.gov
    public final void c() {
        d3m.c(this.e, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.gov
    public final void hide() {
        this.e.hide();
    }

    @Override // xsna.gov
    public final void show() {
        this.e.show();
    }

    /* compiled from: SelectionStickerViewWrapper.kt */
    public final class a implements uei0 {

        /* compiled from: SelectionStickerViewWrapper.kt */
        /* renamed from: xsna.dfi0$a$a, reason: collision with other inner class name */
        public final class C2731a extends RuntimeException {
            public C2731a(String str) {
                super("unsupported sticker selected: ".concat(str));
            }
        }

        public a() {
        }

        @Override // xsna.uei0
        public final void a() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("StoryLinkSticker"));
        }

        @Override // xsna.uei0
        public final void b() {
            d0e d0eVar = d0e.this;
            ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type = ClipsEditorStickersStyleEditScreen$Type.MENTION;
            Bundle bundle = new Bundle();
            bundle.putSerializable("sticker_type", clipsEditorStickersStyleEditScreen$Type);
            d0eVar.d.b(ClipsEditorScreen.State.STICKERS_STYLE_EDITOR, new ClipsEditorScreen.a.C0579a(bundle));
        }

        @Override // xsna.uei0
        public final void c() {
            Date date;
            try {
                new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ENGLISH);
                date = Calendar.getInstance().getTime();
            } catch (Throwable th) {
                L.g("Can't parse date from exif", th);
                date = null;
            }
            if (date == null) {
                date = Calendar.getInstance().getTime();
            }
            dfi0.this.b.a(new yjm0(new nvo0(false, new m0g0(date))));
        }

        @Override // xsna.uei0
        public final void close() {
            d0e.this.d.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
        }

        @Override // xsna.uei0
        public final void d(VmojiAvatar vmojiAvatar) {
            b6m.e().c(dfi0.this.a, vmojiAvatar);
        }

        @Override // xsna.uei0
        public final void e() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("MusicSticker"));
        }

        @Override // xsna.uei0
        public final void f() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("GeoSticker"));
        }

        @Override // xsna.uei0
        public final void h() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("StoryGoodSticker"));
        }

        @Override // xsna.uei0
        public final void i() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("StoryPollSticker"));
        }

        @Override // xsna.uei0
        public final void j() {
            com.vk.metrics.eventtracking.b.a.q(new C2731a("QuestionSticker"));
        }

        @Override // xsna.uei0
        public final void k() {
            d0e d0eVar = d0e.this;
            ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type = ClipsEditorStickersStyleEditScreen$Type.HASHTAG;
            Bundle bundle = new Bundle();
            bundle.putSerializable("sticker_type", clipsEditorStickersStyleEditScreen$Type);
            d0eVar.d.b(ClipsEditorScreen.State.STICKERS_STYLE_EDITOR, new ClipsEditorScreen.a.C0579a(bundle));
        }

        @Override // xsna.uei0
        public final void l(String str, String str2) {
            s(new c0e.b(str, null, WebStickerType.EMOJI, str2, 50));
        }

        @Override // xsna.uei0
        public final void m(GifItem gifItem) {
            String h = ixj0.h(gifItem.c.b);
            if (h == null) {
                h = "";
            }
            s(new c0e.b(h, null, WebStickerType.GIF, gifItem.b, 50));
        }

        @Override // xsna.uei0
        public final void n() {
            d6w0.a(b6m.e(), dfi0.this.a, "keyboard_camera_editor", null, 8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.uei0
        public final void p() {
            dfi0 dfi0Var = dfi0.this;
            Activity h = e3m.h(dfi0Var.a);
            if (h == 0) {
                return;
            }
            rwi.d().h().d(167, h, new nyq(26));
            aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
            if (aeg0Var != null) {
                aeg0Var.Li(dfi0Var.d);
            }
        }

        @Override // xsna.uei0
        public final void r(EditorSticker editorSticker) {
            c0e.b bVar;
            int i = editorSticker.c;
            int i2 = editorSticker.b;
            String str = editorSticker.e;
            if (str == null || !myc0.f(str)) {
                String str2 = editorSticker.d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                WebStickerType webStickerType = WebStickerType.STICKER;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('_');
                sb.append(i);
                bVar = new c0e.b(str3, null, webStickerType, sb.toString(), 50);
            } else {
                String str4 = editorSticker.d;
                WebStickerType webStickerType2 = WebStickerType.LOTTIE;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append('_');
                sb2.append(i);
                bVar = new c0e.b(str, str4, webStickerType2, sb2.toString(), 48);
            }
            s(bVar);
        }

        public final void s(c0e.b bVar) {
            dfi0 dfi0Var = dfi0.this;
            d0e.a aVar = dfi0Var.b;
            hg1.h(cug0.a(dfi0Var.c.a(bVar, new MediaUtils.d(d0e.this.c.getWidth(), d0e.this.c.getHeight())).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), dfi0Var.a, new gtl(5), null, new cfi0(0)), new d0w(dfi0Var, 24));
        }

        @Override // xsna.uei0
        public final void g() {
        }

        @Override // xsna.uei0
        public final void o() {
        }

        @Override // xsna.uei0
        public final void q() {
        }
    }
}
