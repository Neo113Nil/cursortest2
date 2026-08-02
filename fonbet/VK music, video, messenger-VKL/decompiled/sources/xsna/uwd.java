package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.FragmentType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ixd;
import xsna.xwo0;
import xsna.zwd;

/* compiled from: ClipsEditorAudioItemMapper.kt */
/* loaded from: classes16.dex */
public final class uwd {
    public final int a;
    public final long b;
    public final boolean c;
    public final Context d;
    public final m900<Integer, Drawable> e;

    /* compiled from: ClipsEditorAudioItemMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorAudioItem.Type.values().length];
            try {
                iArr[ClipsEditorAudioItem.Type.EXTRACTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorAudioItem.Type.LICENSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditorAudioItem.Type.VOICEOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uwd(int i, long j, boolean z, Context context, m900<Integer, Drawable> m900Var) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = context;
        this.e = m900Var;
    }

    public final ArrayList a(List list, cxd cxdVar) {
        oy4 oy4Var;
        int i;
        int color;
        String string;
        String uri;
        cyd cydVar = cxdVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) it.next();
            m900<Integer, Drawable> m900Var = this.e;
            Context context = this.d;
            if (clipsEditorAudioItem != null) {
                float f = clipsEditorAudioItem.c;
                ClipsEditorMusicInfo clipsEditorMusicInfo = clipsEditorAudioItem.a;
                ClipsEditorAudioItem.Type d = clipsEditorAudioItem.d();
                int[] iArr = a.$EnumSwitchMapping$0;
                int i2 = iArr[d.ordinal()];
                if (i2 == 1) {
                    ixd ixdVar = ad0.g;
                    if (ixdVar == null) {
                        ixdVar = null;
                    }
                    ixd.b bVar = ixdVar.a;
                    i = R.drawable.vk_icon_video_arrow_square_outline_24;
                } else if (i2 == 2) {
                    ixd ixdVar2 = ad0.g;
                    if (ixdVar2 == null) {
                        ixdVar2 = null;
                    }
                    ixd.b bVar2 = ixdVar2.a;
                    i = R.drawable.vk_icon_music_outline_20;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ixd ixdVar3 = ad0.g;
                    if (ixdVar3 == null) {
                        ixdVar3 = null;
                    }
                    ixd.b bVar3 = ixdVar3.a;
                    i = R.drawable.vk_icon_voice_outline_20;
                }
                int i3 = i;
                int i4 = iArr[clipsEditorAudioItem.d().ordinal()];
                if (i4 == 1) {
                    ixd ixdVar4 = ad0.g;
                    if (ixdVar4 == null) {
                        ixdVar4 = null;
                    }
                    ixd.a aVar = ixdVar4.b;
                    color = context.getColor(R.color.vk_neon_pink);
                } else if (i4 == 2) {
                    ixd ixdVar5 = ad0.g;
                    if (ixdVar5 == null) {
                        ixdVar5 = null;
                    }
                    ixd.a aVar2 = ixdVar5.b;
                    color = context.getColor(R.color.vk_sky_300);
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ixd ixdVar6 = ad0.g;
                    if (ixdVar6 == null) {
                        ixdVar6 = null;
                    }
                    ixd.a aVar3 = ixdVar6.b;
                    color = context.getColor(R.color.vk_purple_light);
                }
                int i5 = color;
                ClipsEditorAudioItem.Type d2 = clipsEditorAudioItem.d();
                ClipsEditorAudioItem.Type type = ClipsEditorAudioItem.Type.LICENSED;
                boolean z = this.c;
                FragmentType fragmentType = (d2 == type || z) ? FragmentType.LICENSED_MUSIC : FragmentType.AUDIO;
                xwo0.b bVar4 = new xwo0.b(context, cxdVar, m900Var);
                if (clipsEditorAudioItem.d() == type || z) {
                    bVar4.a(cydVar.h, 9, R.string.clip_timeline_action_volume);
                    if (clipsEditorMusicInfo.b.k != null) {
                        bVar4.a(cydVar.e, 5, R.string.clip_timeline_action_effects);
                    }
                    if (clipsEditorAudioItem.getDurationMs() < ((long) (clipsEditorMusicInfo.b.e / f))) {
                        bVar4.a(cydVar.i, 10, R.string.clip_timeline_action_crop);
                    }
                    if (clipsEditorMusicInfo.b.k != null) {
                        bVar4.a(cydVar.k, 12, R.string.clip_timeline_action_speed);
                    }
                    bVar4.a(cydVar.g, 8, R.string.clip_timeline_action_replace);
                    bVar4.a(cydVar.b, 2, R.string.clip_timeline_action_delete);
                } else {
                    bVar4.a(cydVar.h, 9, R.string.clip_timeline_action_volume);
                    bVar4.a(cydVar.e, 5, R.string.clip_timeline_action_effects);
                    if (clipsEditorAudioItem.getDurationMs() < ((long) (clipsEditorMusicInfo.b.e / f))) {
                        bVar4.a(cydVar.i, 10, R.string.clip_timeline_action_crop);
                    }
                    bVar4.a(cydVar.k, 12, R.string.clip_timeline_action_speed);
                    bVar4.a(cydVar.a, 1, R.string.clip_timeline_action_duplicate);
                    bVar4.a(cydVar.b, 2, R.string.clip_timeline_action_delete);
                }
                int color2 = context.getColor(R.color.vk_gray_850);
                Uri uri2 = clipsEditorMusicInfo.b.i;
                qwo0 qwo0Var = new qwo0(color2, i5, i5, i3, 64, (String) null, (uri2 == null || (uri = uri2.toString()) == null) ? null : cqm0.a(uri));
                String str = clipsEditorAudioItem.f;
                long j = clipsEditorMusicInfo.d;
                long j2 = clipsEditorMusicInfo.e;
                long j3 = clipsEditorAudioItem.getOffset().a;
                long j4 = bzd.z;
                long min = Math.min(clipsEditorAudioItem.b(), this.b - clipsEditorAudioItem.getOffset().a);
                long j5 = (long) (clipsEditorMusicInfo.b.e / f);
                String name = fragmentType.name();
                int color3 = context.getColor(R.color.vk_white_alpha20);
                String str2 = clipsEditorMusicInfo.g;
                boolean z2 = fragmentType == FragmentType.LICENSED_MUSIC;
                int i6 = clipsEditorMusicInfo.h;
                Integer valueOf = Integer.valueOf(i6);
                if (i6 <= 0) {
                    valueOf = null;
                }
                Long valueOf2 = valueOf != null ? Long.valueOf(valueOf.intValue()) : null;
                boolean z3 = clipsEditorAudioItem.e;
                int i7 = iArr[clipsEditorAudioItem.d().ordinal()];
                if (i7 == 1) {
                    string = context.getString(R.string.clip_editor_audio_editing_shift_hint_imported_audio);
                } else if (i7 == 2) {
                    string = context.getString(R.string.clip_editor_audio_editing_shift_hint_music);
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = context.getString(R.string.clip_editor_audio_editing_shift_hint_voiceover);
                }
                oy4Var = new oy4(str, j, j2, j4, min, j3, j5, name, bVar4.c, str2, qwo0Var, i5, color3, this.a, z2, false, valueOf2, z3, string, clipsEditorAudioItem.c);
            } else if (cydVar.j.a) {
                ArrayList arrayList2 = new ArrayList();
                zwd.b bVar5 = cydVar.j;
                String s = wlb0.s(R.string.clip_editor_add_music, context);
                int i8 = bVar5.b;
                Drawable drawable = m900Var.get(Integer.valueOf(i8));
                if (drawable == null) {
                    drawable = m33.a(i8, context);
                    m900Var.put(Integer.valueOf(i8), drawable);
                }
                arrayList2.add(new las(11, drawable, s));
                String s2 = wlb0.s(R.string.clip_editor_add_music, context);
                int color4 = context.getColor(R.color.vk_gray_850);
                int color5 = context.getColor(R.color.vk_white);
                ixd ixdVar7 = ad0.g;
                ixd.b bVar6 = (ixdVar7 == null ? null : ixdVar7).a;
                qwo0 qwo0Var2 = new qwo0(color4, 0, color5, R.drawable.vk_icon_music_outline_20, 100, s2, (String) null);
                int color6 = context.getColor(R.color.vk_gray_100);
                int color7 = context.getColor(R.color.vk_gray_100);
                long j6 = this.b;
                oy4Var = new oy4("AUDIO_TIMELINE_ITEM_ADD_ID", 0L, j6, j6, j6, 0L, j6, "LICENSED_MUSIC", arrayList2, null, qwo0Var2, color6, color7, this.a, true, true, null, false, null, 1.0f);
            } else {
                oy4Var = null;
            }
            if (oy4Var != null) {
                arrayList.add(oy4Var);
            }
        }
        return arrayList;
    }
}
