package xsna;

import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.z7w0;

/* compiled from: VmojiCharacterListMapper.kt */
/* loaded from: classes7.dex */
public final class b7w0 {

    /* compiled from: VmojiCharacterListMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CharacterContext.values().length];
            try {
                iArr[CharacterContext.MY_CHARACTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(z7w0.a aVar, ArrayList arrayList) {
        if (aVar.e.isEmpty()) {
            return;
        }
        if (aVar.b != CharacterContext.MY_CHARACTER) {
            arrayList.add(xfp.b);
        }
        for (RecommendationsBlockModel recommendationsBlockModel : aVar.e) {
            sf90 sf90Var = aVar.i.get(recommendationsBlockModel.b);
            if (sf90Var != null) {
                arrayList.add(new dbf0(recommendationsBlockModel, sf90Var));
            }
        }
    }

    public static void b(z7w0.a aVar, ArrayList arrayList) {
        Object obj;
        List<VmojiStickerPackPreviewModel> list = aVar.d;
        List<VmojiStickerPackPreviewModel> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        VmojiCharacterModel vmojiCharacterModel = aVar.c;
        ArrayList arrayList2 = new ArrayList();
        if (a.$EnumSwitchMapping$0[vmojiCharacterModel.d.ordinal()] == 1) {
            List<VmojiStickerPackPreviewModel> list3 = list;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (((VmojiStickerPackPreviewModel) obj2).g) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(new h6w0(R.string.vmoji_character_my_packs));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new g7w0((VmojiStickerPackPreviewModel) it.next(), true));
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list3) {
                if (!((VmojiStickerPackPreviewModel) obj3).g) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList2.add(new h6w0(R.string.vmoji_character_hidden_packs));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new e7w0((VmojiStickerPackPreviewModel) it2.next()));
                }
            }
        } else {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                int i = ((VmojiStickerPackPreviewModel) obj).b;
                Integer num = vmojiCharacterModel.k;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = (VmojiStickerPackPreviewModel) obj;
            if (vmojiStickerPackPreviewModel == null) {
                vmojiStickerPackPreviewModel = (VmojiStickerPackPreviewModel) j5g.Y(list);
            }
            arrayList2.add(new h6w0(R.string.vmoji_character_pack_block_title));
            arrayList2.add(new g7w0(vmojiStickerPackPreviewModel, false));
        }
        arrayList.addAll(arrayList2);
    }
}
