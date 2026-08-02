package xsna;

import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.i8w0;
import xsna.sf90;
import xsna.z7w0;

/* compiled from: VmojiCharacterReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class u7w0 extends FunctionReferenceImpl implements izs<z7w0.a, i8w0.a> {
    @Override // xsna.izs
    public final i8w0.a invoke(z7w0.a aVar) {
        ArrayList arrayList;
        z7w0.a aVar2 = aVar;
        ((b7w0) this.receiver).getClass();
        ArrayList arrayList2 = new ArrayList();
        VmojiCharacterModel vmojiCharacterModel = aVar2.c;
        String str = vmojiCharacterModel.c;
        List<VmojiProductModel> list = vmojiCharacterModel.l;
        arrayList2.add(new r6w0(str, vmojiCharacterModel.d, vmojiCharacterModel.e, vmojiCharacterModel.g, vmojiCharacterModel.h, vmojiCharacterModel.i, vmojiCharacterModel.j, vmojiCharacterModel.b.Cb(), vmojiCharacterModel.f, vmojiCharacterModel.m, vmojiCharacterModel.n));
        if (aVar2.b == CharacterContext.MY_CHARACTER) {
            b7w0.a(aVar2, arrayList2);
            b7w0.b(aVar2, arrayList2);
            sf90 sf90Var = aVar2.h;
            if (!(sf90Var instanceof sf90.b)) {
                if (sf90Var instanceof sf90.c) {
                    arrayList2.add(u990.b);
                } else {
                    if (!(sf90Var instanceof sf90.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new n990(((sf90.a) sf90Var).b));
                }
            }
        } else {
            if (!list.isEmpty()) {
                VmojiProductModel vmojiProductModel = aVar2.f;
                if (list != null) {
                    List<VmojiProductModel> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    for (VmojiProductModel vmojiProductModel2 : list2) {
                        arrayList.add(new l9w0(vmojiProductModel2, epx.f(vmojiProductModel2, vmojiProductModel)));
                    }
                } else {
                    arrayList = null;
                }
                arrayList2.add(new t9w0(vmojiCharacterModel, arrayList));
            }
            b7w0.b(aVar2, arrayList2);
            b7w0.a(aVar2, arrayList2);
        }
        return new i8w0.a(aVar2.b, vmojiCharacterModel.b, vmojiCharacterModel.f, arrayList2, aVar2.g instanceof z7w0.a.AbstractC4164a.b, aVar2.f);
    }
}
