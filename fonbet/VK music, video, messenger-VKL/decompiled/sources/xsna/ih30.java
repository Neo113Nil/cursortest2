package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: MsgBodiesFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class ih30 {
    public static final a a = new a();
    public static final tz30 b;

    /* compiled from: MsgBodiesFormatter.kt */
    public static final class a extends ThreadLocal<SpannableStringBuilder> {
        @Override // java.lang.ThreadLocal
        public final SpannableStringBuilder initialValue() {
            return new SpannableStringBuilder();
        }
    }

    static {
        dhr0.a.getClass();
        b = new tz30(dhr0.E());
    }

    public static LinkedHashMap a(DialogsHistory dialogsHistory, ProfilesSimpleInfo profilesSimpleInfo, Peer peer) {
        Map<Long, Msg> s = dialogsHistory.s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = dialogsHistory.k().size();
        for (int i = 0; i < size; i++) {
            Dialog dialog = dialogsHistory.k().get(i);
            Msg msg = s.get(dialog.Sb());
            if (msg != null) {
                linkedHashMap.put(Long.valueOf(msg.c), b(msg, dialog, profilesSimpleInfo, peer));
            }
        }
        return linkedHashMap;
    }

    public static SpannableString b(Msg msg, Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, Peer peer) {
        SpannableStringBuilder spannableStringBuilder = a.get();
        if ((dialog != null ? dialog.Kb() : null) != null && dialog.Kb().d()) {
            return c(dialog.ac(), dialog.Kb());
        }
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.clear();
        spannableStringBuilder.append((CharSequence) b.b(msg, profilesSimpleInfo, dialog, com.vk.dto.common.a.b(peer)));
        kh30.a(spannableStringBuilder, msg, dialog, profilesSimpleInfo);
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        return new SpannableString(spannableStringBuilder);
    }

    public static SpannableString c(long j, DraftMsg draftMsg) {
        Iterable iterable;
        SpannableStringBuilder spannableStringBuilder = a.get();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.clear();
        List<CnvMsgId> list = draftMsg.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CnvMsgId cnvMsgId : list) {
            NestedMsg nestedMsg = new NestedMsg();
            nestedMsg.d = cnvMsgId.c;
            nestedMsg.e = cnvMsgId.b;
            nestedMsg.b = NestedMsg.Type.FWD;
            arrayList.add(nestedMsg);
        }
        Integer num = draftMsg.f;
        if (num != null) {
            int intValue = num.intValue();
            NestedMsg nestedMsg2 = new NestedMsg();
            nestedMsg2.d = intValue;
            nestedMsg2.e = j;
            nestedMsg2.b = NestedMsg.Type.REPLY;
            iterable = Collections.singletonList(nestedMsg2);
        } else {
            iterable = EmptyList.b;
        }
        jh30 jh30Var = new jh30();
        jh30Var.b = draftMsg.c;
        jh30Var.c = MsgTextFormat.d;
        jh30Var.d = new ArrayList(draftMsg.e);
        jh30Var.e = draftMsg.b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        jh30Var.f = Peer.Unknown.e;
        jh30Var.g = new ArrayList(j5g.u0(iterable, arrayList));
        spannableStringBuilder.append(b.a(jh30Var));
        dhr0.a.getClass();
        Context E = dhr0.E();
        String string = E.getResources().getString(R.string.vkim_draft);
        spannableStringBuilder.insert(0, (CharSequence) string).insert(string.length(), (CharSequence) E.getResources().getString(R.string.vkim_colon));
        com.vk.im.ui.formatters.spans.dialogitem.b.a(spannableStringBuilder, MsgBodySpan.Type.DRAFT_LABEL, string.length() + 1, 8);
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        return new SpannableString(spannableStringBuilder);
    }
}
